package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.SeaportsService;
import com.prueba.digitalspace.domain.model.dto.request.RequestSeaportsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/seaport")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SeaportController {
    private final SeaportsService seaportsService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Object createSeaport(@RequestBody RequestSeaportsDto requestSeaportsDto){
        return seaportsService.createRequestSeaports(requestSeaportsDto);
    }
}
