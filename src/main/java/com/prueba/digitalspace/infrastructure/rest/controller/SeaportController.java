package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.SeaportsService;
import com.prueba.digitalspace.domain.model.dto.request.RequestSeaportsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/seaport")
@RequiredArgsConstructor
public class SeaportController {
    private final SeaportsService seaportsService;

    @PostMapping("/create")
    public Object createSeaport(@RequestBody RequestSeaportsDto requestSeaportsDto){
        return seaportsService.createRequestSeaports(requestSeaportsDto);
    }
}
