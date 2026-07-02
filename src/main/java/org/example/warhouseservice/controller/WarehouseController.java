package org.example.warhouseservice.controller;

import org.example.warhouseservice.event.OrderCreatedEvent;
import org.example.warhouseservice.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

/**
 * Shop App calls this to process and update order status.
 * Entry point for warehouse workers updating order progress.
 */
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @PostMapping("/orders/evaluate")
    public void evaluateOrder(@RequestBody OrderCreatedEvent event) {
        warehouseService.evaluateOrder(event);
    }
}