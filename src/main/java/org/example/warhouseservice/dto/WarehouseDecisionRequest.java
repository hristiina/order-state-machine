package org.example.warhouseservice.dto;

import org.example.orderservice.dto.OrderStatus;

/**
 * Shop worker's decision after physically checking stock for an order.
 * Sent by the Shop App via POST /warehouse/orders/submit.
 */
public record WarehouseDecisionRequest(

        Long orderId,

        /** ACCEPTED if stock was available, CANCELLED if not. */
        OrderStatus decision

) {}
