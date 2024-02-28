package com.prueba.digitalspace.domain.model.dto.request;

import com.prueba.digitalspace.domain.model.enums.SiteEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RequestWarehouseDto {
    private String warehouseDelivery;
    @Enumerated(EnumType.STRING)
    private SiteEnum site;

    public String getWarehouseDelivery() {
        return warehouseDelivery;
    }

    public SiteEnum getSite() {
        return site;
    }

}
