package org.example.orderservice.services;

import org.example.orderservice.events.OrderStatusChangedEvent;

/**
 * Publishes an event whenever an order's status changes,
 * so other services (e.g. notification service) can react
 */
public interface OrderEventPublisher {

    void publish(OrderStatusChangedEvent event);
}