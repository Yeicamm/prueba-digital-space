package com.prueba.digitalspace.application.service;

import com.prueba.digitalspace.application.mapper.RequestWarehouseDeliveryMapper;
import com.prueba.digitalspace.application.usecase.WarehouseDeliveryService;
import com.prueba.digitalspace.domain.model.constant.MessageApplication;
import com.prueba.digitalspace.domain.model.dto.request.RequestWarehouseDeliveryDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.WarehouseDeliveryEntity;
import com.prueba.digitalspace.infrastructure.adapter.repository.WarehouseDeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WarehouseDeliveryManagementService implements WarehouseDeliveryService {
    private final WarehouseDeliveryRepository warehouseDeliveryRepository;
    @Override
    public Object createWarehouseDelivery(RequestWarehouseDeliveryDto requestWarehouseDeliveryDto) {
        WarehouseDeliveryEntity saveInformation = RequestWarehouseDeliveryMapper.dtoToRequestWarehouseDeliveryMapper(requestWarehouseDeliveryDto);
        warehouseDeliveryRepository.save(saveInformation);
        return MessageApplication.CREATE_WAREHOUSE_DELIVERY_SUCCESSFUL;
    }
}
