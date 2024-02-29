package com.prueba.digitalspace.application.service;

import com.prueba.digitalspace.application.mapper.RequestDeliveryPlanMapper;
import com.prueba.digitalspace.application.usecase.DeliveryPlanService;
import com.prueba.digitalspace.domain.model.constant.MessageApplication;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanMaritimeDto;
import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanTruckLogisticsDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.DeliveryPlanEntity;
import com.prueba.digitalspace.infrastructure.adapter.repository.DeliveryPlanRepository;
import com.prueba.digitalspace.infrastructure.adapter.validation.GuideNumberValidator;
import com.prueba.digitalspace.infrastructure.adapter.validation.PlaqueValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryPlanManagementService implements DeliveryPlanService {
    private final DeliveryPlanRepository deliveryPlanRepository;
    @Override
    public Object createDeliveryPlanTruckLogistics(RequestDeliveryPlanTruckLogisticsDto request) {
        if (GuideNumberValidator.validPlaque(request.getGuideNumber())){
            if (PlaqueValidator.validPlaque(request.getVehicleNumber())){
                DeliveryPlanEntity saveInformation = RequestDeliveryPlanMapper.dtoRequestDeliveryPlanTruckLogisticsMapper(request);
                if (request.getProductQuantityDto()> 10){
                    var discountPrice = request.getPrice() * 0.05;
                    var discount = request.getPrice()-discountPrice;
                    saveInformation.setPriceDiscount(discount);
                }
                deliveryPlanRepository.save(saveInformation);
                return MessageApplication.CREATE_DELIVERY_PLAN_TRUCK_LOGISTIC_SUCCESSFUL;
            }else {
                return MessageApplication.STRUCTURE_PLAQUE;
            }
        }else {
            return MessageApplication.STRUCTURE_GUIDE_NUMBER;
        }
    }
    @Override
    public Object createDeliveryMaritimeLogistics(RequestDeliveryPlanMaritimeDto request) {
        if (GuideNumberValidator.validPlaque(request.getGuideNumber())){
            if (PlaqueValidator.validFleet(request.getVehicleNumber())){
                DeliveryPlanEntity saveInformation = RequestDeliveryPlanMapper.dtoRequestDeliveryPlanMaritimeMapper(request);
                if (request.getProductQuantityDto()> 10){
                    var discountPrice = request.getPrice() * 0.03;
                    var discount = request.getPrice()-discountPrice;
                    saveInformation.setPriceDiscount(discount);
                }
                deliveryPlanRepository.save(saveInformation);
                return MessageApplication.CREATE_DELIVERY_PLAN_MARITIME_SUCCESSFUL;
            }else {
                return MessageApplication.STRUCTURE_PLAQUE;
            }
        }else {
            return MessageApplication.STRUCTURE_GUIDE_NUMBER;
        }
    }
}
