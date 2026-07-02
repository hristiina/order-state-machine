package org.example.notificationservice.controller;

import org.example.notificationservice.service.OrderStatusNotifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * Customer app subscribes here to receive real-time order updates.
 */
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final OrderStatusNotifier notifier;

    public NotificationController(OrderStatusNotifier notifier) {
        this.notifier = notifier;
    }

    @GetMapping(
            value = "/orders/{orderId}/status",
            produces = MediaType.TEXT_EVENT_STREAM_VALUE
    )
    public SseEmitter subscribeToOrder(@PathVariable Long orderId) {
        return notifier.subscribe(orderId);
    }
}