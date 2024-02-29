package com.prueba.digitalspace.application.service;

import com.prueba.digitalspace.application.mapper.RequestTypeProductMapper;
import com.prueba.digitalspace.application.usecase.TypeProductService;
import com.prueba.digitalspace.domain.model.constant.MessageApplication;
import com.prueba.digitalspace.domain.model.dto.request.RequestTypeProductDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.TypeProductsEntity;
import com.prueba.digitalspace.infrastructure.adapter.repository.TypeProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TypeProductManagementService implements TypeProductService{
    private final TypeProductRepository typeProductRepository;
    @Override
    public Object createTypeProduct(RequestTypeProductDto requestTypeProductDto) {
        TypeProductsEntity saveInformation = RequestTypeProductMapper.dtoToRequestTypeProductMapper(requestTypeProductDto);
        typeProductRepository.save(saveInformation);
        return MessageApplication.CREATE_TYPE_PRODUCT_SUCCESSFUL;
    }
}
