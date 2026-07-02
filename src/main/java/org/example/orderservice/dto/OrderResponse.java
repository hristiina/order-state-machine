package org.example.orderservice.dto;

import java.math.BigDecimal;

/**
 * Response returned to the client after creating an order
 * or transitioning its status.
 */
public record OrderResponse(

        Long orderId,

        OrderStatus status,

        BigDecimal totalAmount

) {
    public static OrderResponse from(Order order) {
        return new OrderResponse(order.getId(), order.getStatus(), order.getPrice());
    }
}
