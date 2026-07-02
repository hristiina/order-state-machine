package org.example.orderservice.event;

import org.example.orderservice.dto.OrderStatus;

/**
 * Published by warehouse service — a request for order service
 * to apply a status change, not yet validated or persisted.
 * Topic: warehouse-decisions
 * Consumed by: order service (OrderStatusUpdateListener)
 */
public record WarehouseDecisionEvent(

        Long orderId,

        /** Status warehouse wants applied, e.g. ACCEPTED or CANCELLED. */
        OrderStatus requestedStatus

) {}