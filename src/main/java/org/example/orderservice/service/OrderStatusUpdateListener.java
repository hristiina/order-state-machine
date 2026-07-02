package org.example.orderservice.service;

import org.example.orderservice.event.WarehouseDecisionEvent;

/**
 * Listens for status decision events published by warehouse service
 * and applies the corresponding transition via OrderService.
 */
public interface OrderStatusUpdateListener {

    /** Consumes a warehouse decision event and triggers
     *  OrderService.updateStatus() with the resulting status. */
    void onWarehouseDecision(WarehouseDecisionEvent event);
}