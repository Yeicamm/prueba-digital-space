package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.TypeProductService;
import com.prueba.digitalspace.domain.model.dto.request.RequestTypeProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class TypeProductController {
    private final TypeProductService typeProductService;

    @PostMapping("/create")
    public Object createTypeProduct(@RequestBody RequestTypeProductDto requestTypeProductDto){
        return typeProductService.createTypeProduct(requestTypeProductDto);
    }
}
