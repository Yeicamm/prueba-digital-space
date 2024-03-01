package com.prueba.digitalspace.infrastructure.rest.controller;

import com.prueba.digitalspace.application.usecase.TypeProductService;
import com.prueba.digitalspace.domain.model.dto.request.RequestTypeProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TypeProductController {
    private final TypeProductService typeProductService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Object createTypeProduct(@RequestBody RequestTypeProductDto requestTypeProductDto){
        return typeProductService.createTypeProduct(requestTypeProductDto);
    }
}
