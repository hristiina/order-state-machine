package org.example.warhouseservice.dto;

import org.example.orderservice.dto.OrderStatus;

/**
 * Admin or Shop Assistant's decision after checking stock availability in the Inventory DB.
 * Sent by the Web App's admin page via POST /warehouse/order.
 */
public record WarehouseDecisionRequest(

        Long orderId,

        /** ACCEPTED if stock was available, CANCELLED if not. */
        OrderStatus decision

) {}
