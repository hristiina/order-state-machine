package org.example.warhouseservice.service;

import org.example.orderservice.event.WarehouseDecisionEvent;

/**
 * Publishes warehouse's decision after checking stock.
 */
public interface WarehouseDecisionPublisher {

    /**
     * Publishes warehouse's stock decision so order service can apply
     * the resulting status transition. Called at the end of
     * WarehouseService.evaluateOrder(), once the decision is final.
     *
     * @param event the decision to publish (orderId + requestedStatus)
     */
    void publish(WarehouseDecisionEvent event);
}