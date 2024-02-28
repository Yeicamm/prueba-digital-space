package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.DeliveryPlanService;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanMaritimeDto;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanTruckLogisticsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delivery")
@RequiredArgsConstructor
public class DeliveryPlanController {
    private final DeliveryPlanService deliveryPlanService;

    @PostMapping("/create-truck")
    public Object createDeliveryPlanTruckLogistics(@RequestBody RequestDeliveryPlanTruckLogisticsDto request){
        return deliveryPlanService.createDeliveryPlanTruckLogistics(request);
    }
    @PostMapping("/create-fleet")
    public Object createDeliveryPlanMaritime(@RequestBody RequestDeliveryPlanMaritimeDto request){
        return deliveryPlanService.createDeliveryMaritimeLogistics(request);
    }
}
