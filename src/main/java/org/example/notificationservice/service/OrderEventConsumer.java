package org.example.notificationservice.service;

import org.example.orderservice.events.OrderStatusChangedEvent;
import org.springframework.context.event.EventListener;

/**
 * Notification service's inbound entry point — reacts when an order's
 * status has changed and forwards it to the notifier.
 */
public interface OrderEventConsumer {

    /**
     * Called when a status change event arrives.
     * Internally calls OrderStatusNotifier.notifyStatusChange()
     * with the orderId and newStatus taken from the event.
     */
    @EventListener
    void onStatusChanged(OrderStatusChangedEvent event);
}