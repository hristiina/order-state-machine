package org.example.warhouseservice.service;

import org.example.warhouseservice.event.OrderCreatedEvent;

/**
 * Warehouse service's inbound listener — reacts when a new order
 * is created, making it visible to the Admin or Shop Assistant for a stock check.
 * calls WarehouseService.registerNewOrder(event)
 *
 * <p>Intended to be implemented as a {@code @KafkaListener} on topic
 * {@code order-created} — see OrderCreatedEvent.
 */
public interface WarehouseOrderListener {

    void onOrderCreated(OrderCreatedEvent event);
}
