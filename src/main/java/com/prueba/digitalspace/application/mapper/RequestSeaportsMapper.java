package com.prueba.digitalspace.application.mapper;

import com.prueba.digitalspace.domain.model.dto.request.RequestSeaportsDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.SeaportsEntity;

public class RequestSeaportsMapper {
    public static SeaportsEntity dtoToRequestSeaportsDto(RequestSeaportsDto requestSeaportsDto){
        SeaportsEntity seaportsEntity = new SeaportsEntity();
        seaportsEntity.setSeaports(requestSeaportsDto.getSeaports());
        seaportsEntity.setSiteEnum(requestSeaportsDto.getSite());
        return seaportsEntity;
    }
}
