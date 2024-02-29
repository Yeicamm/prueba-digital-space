package com.prueba.digitalspace.domain.model.dto.request;

import java.time.LocalDateTime;

public class RequestDeliveryPlanMaritimeDto {
    private Long productQuantityDto;
    private LocalDateTime dateRegister;
    private String dateDelivery;
    private String vehicleNumber;
    private String guideNumber;
    private Double price;
    private Double priceDiscount;
    private Long typeProducts;
    private Long seaports;
    private Long customers;

    public Double getPriceDiscount() {
        return priceDiscount;
    }

    public Long getProductQuantityDto() {
        return productQuantityDto;
    }

    public Long getSeaports() {
        return seaports;
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

    public Double getPrice() {
        return price;
    }

    public Long getTypeProducts() {
        return typeProducts;
    }
    public Long getCustomers() {
        return customers;
    }
}
