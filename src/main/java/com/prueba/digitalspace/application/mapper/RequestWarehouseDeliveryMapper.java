package com.prueba.digitalspace.application.mapper;

import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDeliveryDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.WarehouseDeliveryEntity;

public class RequestWarehouseDeliveryMapper {
    public static WarehouseDeliveryEntity dtoToRequestWarehouseDeliveryMapper(RequestWarehouseDeliveryDto requestWarehouseDeliveryDto){
        WarehouseDeliveryEntity warehouseDelivery = new WarehouseDeliveryEntity();
        warehouseDelivery.setWarehouseDelivery(requestWarehouseDeliveryDto.getWarehouseDelivery());
        warehouseDelivery.setSiteEnum(requestWarehouseDeliveryDto.getSite());
        return warehouseDelivery;
    }
}
