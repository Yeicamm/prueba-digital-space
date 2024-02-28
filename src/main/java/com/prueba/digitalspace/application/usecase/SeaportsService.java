package com.prueba.digitalspace.application.usecase;

import com.prueba.digitalspace.domain.model.dto.request.RequestSeaportsDto;

public interface SeaportsService {
    Object createRequestSeaports(RequestSeaportsDto requestSeaportsDto);
}
