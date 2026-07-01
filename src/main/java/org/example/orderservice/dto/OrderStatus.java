package org.example.orderservice.dto;

import java.util.Map;
import java.util.Set;

/**
 * The states an {@link Order} can occupy, and the transitions allowed between them.
 */
public enum OrderStatus {
    CREATED,
    ACCEPTED,
    IN_PROCESS,
    DELIVERED,
    CANCELLED;

    private static final Map<OrderStatus, Set<OrderStatus>> TRANSITIONS = Map.of(
            CREATED,    Set.of(ACCEPTED, CANCELLED),
            ACCEPTED,   Set.of(IN_PROCESS, CANCELLED),
            IN_PROCESS, Set.of(DELIVERED, CANCELLED),
            DELIVERED,  Set.of(),
            CANCELLED,  Set.of()
    );

    /**
     * @param target the status a caller wants to move an order into
     * @return true if moving from this status to {@code target} is a legal transition
     */
    public boolean canTransitionTo(OrderStatus target) {
        return TRANSITIONS.get(this).contains(target);
    }
}
