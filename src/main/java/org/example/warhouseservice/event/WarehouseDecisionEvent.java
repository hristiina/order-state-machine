package org.example.warhouseservice.event;

import org.example.orderservice.dto.OrderStatus;

/**
 * Published by warehouse service with its stock decision.
 * Topic: warehouse-decisions
 * Consumed by: order service (OrderStatusUpdateListener)
 */
public record WarehouseDecisionEvent(

        Long orderId,

        /** Status warehouse wants applied — ACCEPTED if stock was
         *  available, CANCELLED if not. */
        OrderStatus requestedStatus

) {}