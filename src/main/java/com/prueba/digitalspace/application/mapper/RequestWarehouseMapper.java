package com.prueba.digitalspace.application.mapper;

import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.WarehouseEntity;

public class RequestWarehouseMapper {
    public static WarehouseEntity dtoToRequestWarehouseDeliveryMapper(RequestWarehouseDto requestWarehouseDeliveryDto){
        WarehouseEntity warehouseDelivery = new WarehouseEntity();
        warehouseDelivery.setWarehouseDelivery(requestWarehouseDeliveryDto.getWarehouseDelivery());
        warehouseDelivery.setSiteEnum(requestWarehouseDeliveryDto.getSite());
        return warehouseDelivery;
    }
}
