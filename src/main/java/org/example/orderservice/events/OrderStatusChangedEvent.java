package org.example.orderservice.events;

import org.example.orderservice.dto.OrderStatus;

import java.time.Instant;

/**
 * Immutable event representing a single order status transition.
 * Published by order service whenever a status change is persisted.
 * Topic: order-status-changed
 * Consumed by: notification service (OrderEventConsumer)
 */
public record OrderStatusChangedEvent(

        /** ID of the order that changed. */
        Long orderId,

        /** Status before the transition. */
        OrderStatus previousStatus,

        /** Status after the transition. */
        OrderStatus newStatus,

        /** When the transition happened — useful for ordering events
         *  if they arrive out of order, or for auditing. */
        Instant changedAt
) {}
