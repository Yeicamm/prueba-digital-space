package com.prueba.digitalspace.application.usecase;

import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanMaritimeDto;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanTruckLogisticsDto;

public interface DeliveryPlanService {
    Object createDeliveryPlanTruckLogistics(RequestDeliveryPlanTruckLogisticsDto request);
    Object createDeliveryMaritimeLogistics(RequestDeliveryPlanMaritimeDto request);
}
