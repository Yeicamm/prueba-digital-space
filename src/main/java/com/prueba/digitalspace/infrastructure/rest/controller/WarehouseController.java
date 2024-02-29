package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.WarehouseDeliveryService;
import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/warehouse")
@RequiredArgsConstructor
@CrossOrigin("*")
public class WarehouseController {
    private final WarehouseDeliveryService warehouseDeliveryService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Object createTypeProduct(@RequestBody RequestWarehouseDto requestWarehouseDeliveryDto){
        return warehouseDeliveryService.createWarehouseDelivery(requestWarehouseDeliveryDto);
    }
}
