package com.prueba.digitalspace.domain.model.dto.request;

import com.prueba.digitalspace.domain.model.enums.SiteEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RequestSeaportsDto {
    private String seaports;
    @Enumerated(EnumType.STRING)
    private SiteEnum site;

    public String getSeaports() {
        return seaports;
    }

    public SiteEnum getSite() {
        return site;
    }

}
