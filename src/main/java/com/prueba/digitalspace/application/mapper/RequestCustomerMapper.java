package com.prueba.digitalspace.application.mapper;

import com.prueba.digitalspace.domain.model.dto.request.RequestCustomerDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.CustomersEntity;

public class RequestCustomerMapper {
    public static CustomersEntity dtoToRequestCustomerEntity(RequestCustomerDto requestCustomerDto){
        CustomersEntity customersEntity = new CustomersEntity();
        customersEntity.setCustomerName(requestCustomerDto.getCustomerNameDto());
        customersEntity.setCustomerEmail(requestCustomerDto.getCustomerEmailDto());
        customersEntity.setAddress(requestCustomerDto.getAddressDto());
        customersEntity.setIdentificationTypeEnum(requestCustomerDto.getIdentificationTypeEnumDto());
        customersEntity.setIdentificationNumber(requestCustomerDto.getIdentificationNumber());
        return customersEntity;
    }
}
