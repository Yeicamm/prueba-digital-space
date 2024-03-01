package com.prueba.digitalspace.application.usecase;

import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanMaritimeDto;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanTruckLogisticsDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.DeliveryPlanEntity;

import java.util.List;

public interface DeliveryPlanService {
    Object createDeliveryPlanTruckLogistics(RequestDeliveryPlanTruckLogisticsDto request);
    Object createDeliveryMaritimeLogistics(RequestDeliveryPlanMaritimeDto request);
    List<DeliveryPlanEntity> findByGuideNumber(String guideNumber);
}
