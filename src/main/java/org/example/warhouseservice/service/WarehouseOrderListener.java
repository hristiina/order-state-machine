package org.example.warhouseservice.service;

import org.example.warhouseservice.event.OrderCreatedEvent;

/**
 * Warehouse service's inbound listener — reacts when a new order
 * is created and decides whether stock supports it.
 * calls WarehouseService.evaluateOrder(event)
 */
public interface WarehouseOrderListener {

    void onOrderCreated(OrderCreatedEvent event);
}
