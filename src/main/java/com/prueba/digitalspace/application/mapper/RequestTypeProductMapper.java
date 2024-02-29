package com.prueba.digitalspace.application.mapper;

import com.prueba.digitalspace.domain.model.dto.request.RequestTypeProductDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.TypeProductsEntity;

public class RequestTypeProductMapper {
    public static TypeProductsEntity dtoToRequestTypeProductMapper(RequestTypeProductDto requestTypeProductDto){
        TypeProductsEntity typeProductsEntity = new TypeProductsEntity();
        typeProductsEntity.setDescriptionProduct(requestTypeProductDto.getDescriptionProductDto());
        typeProductsEntity.setTypeProduct(requestTypeProductDto.getTypeProductDto());
        return typeProductsEntity;
    }
}
