package com.prueba.digitalspace.application.service;

import com.prueba.digitalspace.application.mapper.RequestDeliveryPlanMapper;
import com.prueba.digitalspace.application.usecase.DeliveryPlanService;
import com.prueba.digitalspace.domain.model.constant.MessageApplication;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanTruckLogisticsDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.DeliveryPlanEntity;
import com.prueba.digitalspace.infrastructure.adapter.repository.DeliveryPlanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryPlanManagementService implements DeliveryPlanService {
    private final DeliveryPlanRepository deliveryPlanRepository;
    @Override
    public Object createDeliveryPlanTruckLogistics(RequestDeliveryPlanTruckLogisticsDto request) {
        DeliveryPlanEntity saveInformation = RequestDeliveryPlanMapper.dtoRequestDeliveryPlanTruckLogisticsMapper(request);
        deliveryPlanRepository.save(saveInformation);
        return MessageApplication.CREATE_DELIVERY_PLAN_TRUCK_LOGISTIC_SUCCESSFUL;
    }
}
