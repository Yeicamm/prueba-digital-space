package com.prueba.digitalspace.domain.model.dto.request;

import com.prueba.digitalspace.domain.model.enums.SiteEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RequestWarehouseDeliveryDto {
    private String warehouseDelivery;
    @Enumerated(EnumType.STRING)
    private SiteEnum site;

    public String getWarehouseDelivery() {
        return warehouseDelivery;
    }

    public void setWarehouseDelivery(String warehouseDelivery) {
        this.warehouseDelivery = warehouseDelivery;
    }

    public SiteEnum getSite() {
        return site;
    }

    public void setSite(SiteEnum site) {
        this.site = site;
    }
}
