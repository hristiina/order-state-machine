package org.example.warhouseservice.service;

import org.example.orderservice.dto.OrderStatus;
import org.example.warhouseservice.event.OrderCreatedEvent;

/**
 * Owns stock decisions and inventory updates. Stock decisions are made by
 * an admin, not automatically — see recordDecision().
 */
public interface WarehouseService {

    /** Makes a newly created order visible to the admin so they can
     *  check stock availability in the Inventory DB. Does not decide
     *  or publish anything itself. */
    void registerNewOrder(OrderCreatedEvent event);

    /** Applies the admin's decision: reserves stock if ACCEPTED,
     *  then publishes the resulting WarehouseDecisionEvent. */
    void recordDecision(Long orderId, OrderStatus decision);
}
