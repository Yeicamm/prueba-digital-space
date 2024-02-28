package com.prueba.digitalspace.application.usecase;

import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDeliveryDto;

public interface WarehouseDeliveryService {
    Object createWarehouseDelivery(RequestWarehouseDeliveryDto requestWarehouseDeliveryDto);
}
