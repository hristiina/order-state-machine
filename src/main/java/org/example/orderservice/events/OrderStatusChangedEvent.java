package org.example.orderservice.events;

import org.example.orderservice.dto.OrderStatus;

public class OrderStatusChangedEvent {
    Long orderId;

    OrderStatus previousStatus;

    OrderStatus newStatus;
}
