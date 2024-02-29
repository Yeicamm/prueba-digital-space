package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.DeliveryPlanService;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanMaritimeDto;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanTruckLogisticsDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.DeliveryPlanEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/delivery")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DeliveryPlanController {
    private final DeliveryPlanService deliveryPlanService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-truck")
    public Object createDeliveryPlanTruckLogistics(@RequestBody RequestDeliveryPlanTruckLogisticsDto request){
        return deliveryPlanService.createDeliveryPlanTruckLogistics(request);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-fleet")
    public Object createDeliveryPlanMaritime(@RequestBody RequestDeliveryPlanMaritimeDto request){
        return deliveryPlanService.createDeliveryMaritimeLogistics(request);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/search")
    public List<DeliveryPlanEntity> findByGuideNumber(@RequestParam String guideNumber){
        return deliveryPlanService.findByGuideNumber(guideNumber);
    }
}
