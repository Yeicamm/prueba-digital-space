package com.prueba.digitalspace.application.usecase;

import com.prueba.digitalspace.domain.model.dto.request.RequestTypeProductDto;

public interface TypeProductService {
    Object createTypeProduct(RequestTypeProductDto requestTypeProductDto);
}
