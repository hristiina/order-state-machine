package org.example.orderservice.service;

import org.example.orderservice.event.OrderStatusChangedEvent;
import org.example.warhouseservice.event.OrderCreatedEvent;

/**
 * Publishes events whenever an order is created or its status changes,
 * so other services (e.g. warehouse service, notification service) can react
 */
public interface OrderEventPublisher {

    void publish(OrderCreatedEvent event);

    void publish(OrderStatusChangedEvent event);
}