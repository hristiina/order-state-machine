package org.example.orderservice.dto;

import java.math.BigDecimal;

/**
 * Response returned to the client after creating an order
 * or transitioning its status.
 */
public record OrderResponse(

        Long orderId,

        OrderStatus status,

        /** Total is only meaningful once items/pricing are resolved;
         *  useful on creation, less so on a pure status update. */
        BigDecimal totalAmount

) {
    public static OrderResponse from(Order order) {
        return new OrderResponse(order.getId(), order.getStatus(), order.getPrice());
    }
}
