package com.prueba.digitalspace.application.service;

import com.prueba.digitalspace.application.mapper.RequestCustomerMapper;
import com.prueba.digitalspace.application.usecase.CustomerService;
import com.prueba.digitalspace.domain.model.constant.MessageApplication;
import com.prueba.digitalspace.domain.model.dto.request.RequestCustomerDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.CustomersEntity;
import com.prueba.digitalspace.infrastructure.adapter.repository.CustomerRepository;
import com.prueba.digitalspace.infrastructure.adapter.validation.EmailValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerManagementService implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public Object createCustomer(RequestCustomerDto requestCustomerDto) {
        if(EmailValidator.isValidEmail(requestCustomerDto.getCustomerEmailDto())){
            CustomersEntity saveInformation = RequestCustomerMapper.dtoToRequestCustomerEntity(requestCustomerDto);
            customerRepository.save(saveInformation);
            return MessageApplication.CREATE_CLIENT_SUCCESSFUL;
        }else {
            return MessageApplication.STRUCTURE_EMAIL;
        }
    }
}
