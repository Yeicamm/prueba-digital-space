package com.prueba.digitalspace.application.usecase;

import com.prueba.digitalspace.domain.model.dto.request.RequestCustomerDto;

public interface CustomerService {
    Object createCustomer(RequestCustomerDto requestCustomerDto);
}
