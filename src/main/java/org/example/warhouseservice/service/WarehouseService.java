package org.example.warhouseservice.service;

import org.example.orderservice.dto.OrderStatus;
import org.example.warhouseservice.event.OrderCreatedEvent;

/**
 * Owns stock decisions and inventory updates. Stock decisions are made by
 * a human shop worker, not automatically — see recordDecision().
 */
public interface WarehouseService {

    /** Makes a newly created order visible to shop workers so they can
     *  physically check stock. Does not decide or publish anything itself. */
    void registerNewOrder(OrderCreatedEvent event);

    /** Applies the shop worker's decision: reserves stock if ACCEPTED,
     *  then publishes the resulting WarehouseDecisionEvent. */
    void recordDecision(Long orderId, OrderStatus decision);
}
