package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.WarehouseDeliveryService;
import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/warehouse")
@RequiredArgsConstructor
public class WarehouseController {
    private final WarehouseDeliveryService warehouseDeliveryService;

    @PostMapping("/create")
    public Object createTypeProduct(@RequestBody RequestWarehouseDto requestWarehouseDeliveryDto){
        return warehouseDeliveryService.createWarehouseDelivery(requestWarehouseDeliveryDto);
    }
}
