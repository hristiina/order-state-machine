package org.example.warhouseservice.services;

import org.example.warhouseservice.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;

/**
 * Warehouse service's inbound listener — reacts when a new order
 * is created and decides whether stock supports it.
 * calls WarehouseService.evaluateOrder(event)
 */
public interface WarehouseOrderListener {

    @EventListener
    void onOrderCreated(OrderCreatedEvent event);
}
