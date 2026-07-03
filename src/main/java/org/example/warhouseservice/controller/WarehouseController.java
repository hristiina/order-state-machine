package org.example.warhouseservice.controller;

import org.example.warhouseservice.dto.WarehouseDecisionRequest;
import org.example.warhouseservice.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

/**
 * Called from the Web App's admin page to submit the Admin or Shop Assistant's stock decision for an order.
 */
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @PostMapping("/order")
    public void submitDecision(@RequestBody WarehouseDecisionRequest request) {
        warehouseService.recordDecision(request.orderId(), request.decision());
    }
}
