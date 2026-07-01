package org.example.orderservice.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Incoming payload for creating a new order.
 * Sent by the client via the API gateway.
 */
public record OrderRequest(

        Long productId,
        Long customerId,
        int quantity,
        BigDecimal price

) {}