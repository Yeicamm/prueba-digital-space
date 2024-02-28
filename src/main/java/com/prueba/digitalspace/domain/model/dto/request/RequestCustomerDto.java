package com.prueba.digitalspace.domain.model.dto.request;

import com.prueba.digitalspace.domain.model.enums.IdentificationTypeEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class RequestCustomerDto {
    private String customerNameDto;
    private String customerEmailDto;
    private String addressDto;
    @Enumerated(EnumType.STRING)
    private IdentificationTypeEnum identificationTypeEnumDto;
    private String IdentificationNumber;

    public String getIdentificationNumber() {
        return IdentificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        IdentificationNumber = identificationNumber;
    }

    public String getCustomerNameDto() {
        return customerNameDto;
    }

    public void setCustomerNameDto(String customerNameDto) {
        this.customerNameDto = customerNameDto;
    }

    public String getCustomerEmailDto() {
        return customerEmailDto;
    }

    public void setCustomerEmailDto(String customerEmailDto) {
        this.customerEmailDto = customerEmailDto;
    }

    public String getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(String addressDto) {
        this.addressDto = addressDto;
    }

    public IdentificationTypeEnum getIdentificationTypeEnumDto() {
        return identificationTypeEnumDto;
    }

    public void setIdentificationTypeEnumDto(IdentificationTypeEnum identificationTypeEnumDto) {
        this.identificationTypeEnumDto = identificationTypeEnumDto;
    }
}
