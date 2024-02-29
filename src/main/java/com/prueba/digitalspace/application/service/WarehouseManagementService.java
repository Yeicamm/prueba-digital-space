package com.prueba.digitalspace.application.service;

import com.prueba.digitalspace.application.mapper.RequestWarehouseMapper;
import com.prueba.digitalspace.application.usecase.WarehouseDeliveryService;
import com.prueba.digitalspace.domain.model.constant.MessageApplication;
import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.WarehouseEntity;
import com.prueba.digitalspace.infrastructure.adapter.repository.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WarehouseManagementService implements WarehouseDeliveryService {
    private final WarehouseRepository warehouseDeliveryRepository;
    @Override
    public Object createWarehouseDelivery(RequestWarehouseDto requestWarehouseDeliveryDto) {
        WarehouseEntity saveInformation = RequestWarehouseMapper.dtoToRequestWarehouseDeliveryMapper(requestWarehouseDeliveryDto);
        warehouseDeliveryRepository.save(saveInformation);
        return MessageApplication.CREATE_WAREHOUSE_DELIVERY_SUCCESSFUL;
    }
}
