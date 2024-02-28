package com.prueba.digitalspace.application.usecase;

import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDto;

public interface WarehouseDeliveryService {
    Object createWarehouseDelivery(RequestWarehouseDto requestWarehouseDeliveryDto);
}
