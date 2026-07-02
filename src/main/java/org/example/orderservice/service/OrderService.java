package org.example.orderservice.service;

import org.example.orderservice.dto.OrderRequest;
import org.example.orderservice.dto.OrderResponse;
import org.example.orderservice.dto.OrderStatus;

/**
 * Owns the full order lifecycle: creation and every status transition.
 * The only service allowed to write to order data.
 */
public interface OrderService {
    /** Creates the order with status CREATED, persists it, and
     *  publishes an OrderCreatedEvent via OrderEventPublisher. */
    OrderResponse createOrder(OrderRequest request);
    /** Validates and applies a status transition, then persists it. */
    OrderResponse updateStatus(Long orderId, OrderStatus newStatus);
}