package org.example.warhouseservice.events;

/**
 * Published by order service when a new order is first created.
 * Topic: order-created
 * Consumed by: warehouse service (WarehouseOrderListener)
 */
public record OrderCreatedEvent(

        Long orderId,

        Long productId,

        int quantity

) {}