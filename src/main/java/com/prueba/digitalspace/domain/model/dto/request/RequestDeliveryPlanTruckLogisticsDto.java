package com.prueba.digitalspace.domain.model.dto.request;

import java.time.LocalDateTime;

public class RequestDeliveryPlanTruckLogisticsDto {
    private Long productQuantityDto;
    private LocalDateTime dateRegister;
    private String dateDelivery;
    private String vehicleNumber;
    private String guideNumber;
    private Long typeProducts;
    private Long warehouseDelivery;
    private Long customers;

    public Long getProductQuantityDto() {
        return productQuantityDto;
    }

    public LocalDateTime getDateRegister() {
        return dateRegister;
    }

    public String getDateDelivery() {
        return dateDelivery;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getGuideNumber() {
        return guideNumber;
    }

    public Long getTypeProducts() {
        return typeProducts;
    }

    public Long getWarehouseDelivery() {
        return warehouseDelivery;
    }
    public Long getCustomers() {
        return customers;
    }
}
