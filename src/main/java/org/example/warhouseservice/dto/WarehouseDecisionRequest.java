package org.example.warhouseservice.dto;

import org.example.orderservice.dto.OrderStatus;

/**
 * Admin's decision after checking stock availability in the Inventory DB.
 * Sent by the Shop App via POST /warehouse/order.
 */
public record WarehouseDecisionRequest(

        Long orderId,

        /** ACCEPTED if stock was available, CANCELLED if not. */
        OrderStatus decision

) {}
