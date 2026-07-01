package org.example.notificationservice.service;

import org.example.orderservice.dto.OrderStatus;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * Manages real-time client connections and pushes order status
 * updates as they happen. Decoupled from order service — it only
 * reacts to events, it never calls order service directly.
 */
public interface OrderStatusNotifier {

    /** Opens active connection for a client to receive updates on one order. */
    SseEmitter subscribe(Long orderId);

    /** Pushes a status change to any client currently subscribed to that order. */
    void notifyStatusChange(Long orderId, OrderStatus newStatus);
}
