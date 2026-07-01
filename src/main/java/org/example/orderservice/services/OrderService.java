package org.example.orderservice.services;

import org.example.orderservice.dto.OrderRequest;
import org.example.orderservice.dto.OrderResponse;
import org.example.orderservice.dto.OrderStatus;

/**
 * Owns the full order lifecycle: creation and every status transition.
 * The only service allowed to write to order data.
 */
public interface OrderService {
    /** Creates the order with status CREATED and persists it. */
    OrderResponse createOrder(OrderRequest request);
    /** Validates and applies a status transition, then persists it. */
    OrderResponse updateStatus(Long orderId, OrderStatus newStatus);
}