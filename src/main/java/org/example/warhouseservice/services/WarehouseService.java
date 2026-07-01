package org.example.warhouseservice.services;

import org.example.warhouseservice.events.OrderCreatedEvent;

/**
 * Owns stock decisions and inventory updates.
 */
public interface WarehouseService {

    /** Checks stock, reserves/deducts it if available, and
     *  publishes the resulting decision (ACCEPTED or CANCELLED). */
    void evaluateOrder(OrderCreatedEvent event);

    /** Updates stock levels directly — used internally by
     *  evaluateOrder, and reusable for manual adjustments/restocking. */
    void updateStock(Long productId, int quantityDelta);
}