package com.prueba.digitalspace.application.mapper;

import com.prueba.digitalspace.domain.model.dto.request.RequestDeliveryPlanTruckLogisticsDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.CustomersEntity;
import com.prueba.digitalspace.infrastructure.adapter.entity.DeliveryPlanEntity;
import com.prueba.digitalspace.infrastructure.adapter.entity.TypeProductsEntity;
import com.prueba.digitalspace.infrastructure.adapter.entity.WarehouseEntity;

import java.time.LocalDateTime;

public class RequestDeliveryPlanMapper {
    public static DeliveryPlanEntity dtoRequestDeliveryPlanTruckLogisticsMapper(RequestDeliveryPlanTruckLogisticsDto request){
        DeliveryPlanEntity deliveryPlan = new DeliveryPlanEntity();
        deliveryPlan.setProductQuantity(request.getProductQuantityDto());
        deliveryPlan.setDateRegister(LocalDateTime.now());
        deliveryPlan.setDateDelivery(request.getDateDelivery());
        deliveryPlan.setVehicleNumber(request.getVehicleNumber());
        deliveryPlan.setGuideNumber(request.getGuideNumber());
        TypeProductsEntity typeProductsEntity = new TypeProductsEntity();
        typeProductsEntity.setTypeProductId(request.getTypeProducts());
        deliveryPlan.setTypeProducts(typeProductsEntity);
        WarehouseEntity warehouseEntity = new WarehouseEntity();
        warehouseEntity.setWarehouseDeliveryId(request.getWarehouseDelivery());
        deliveryPlan.setWarehouseDelivery(warehouseEntity);
        CustomersEntity customersEntity = new CustomersEntity();
        customersEntity.setCustomerId(request.getCustomers());
        deliveryPlan.setCustomers(customersEntity);
        return deliveryPlan;
    }

}
