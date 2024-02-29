package com.prueba.digitalspace.application.service;

import com.prueba.digitalspace.application.mapper.RequestSeaportsMapper;
import com.prueba.digitalspace.application.usecase.SeaportsService;
import com.prueba.digitalspace.domain.model.constant.MessageApplication;
import com.prueba.digitalspace.domain.model.dto.request.RequestSeaportsDto;
import com.prueba.digitalspace.infrastructure.adapter.entity.SeaportsEntity;
import com.prueba.digitalspace.infrastructure.adapter.repository.SeaportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeaportsManagementService implements SeaportsService {
    private final SeaportRepository seaportRepository;

    @Override
    public Object createRequestSeaports(RequestSeaportsDto requestSeaportsDto) {
        SeaportsEntity saveInformation = RequestSeaportsMapper.dtoToRequestSeaportsDto(requestSeaportsDto);
        seaportRepository.save(saveInformation);
        return MessageApplication.CREATE_SEAPORT_SUCCESSFUL;
    }
}
