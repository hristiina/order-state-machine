package org.example.warhouseservice.service;

import org.example.warhouseservice.event.OrderCreatedEvent;

/**
 * Warehouse service's inbound listener — reacts when a new order
 * is created, making it visible to the admin for a stock check.
 * calls WarehouseService.registerNewOrder(event)
 */
public interface WarehouseOrderListener {

    void onOrderCreated(OrderCreatedEvent event);
}
