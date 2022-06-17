package com.restaurante.ecommerce.controller;

import com.restaurante.ecommerce.service.PlatilloService;
import com.restaurante.ecommerce.utlis.GenericResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/platillo")
public class PlatilloController {
    private final PlatilloService service;

    public PlatilloController(PlatilloService service) {
        this.service = service;
    }

    @GetMapping
    public GenericResponse listarPlatillosRecomendados(){
        return this.service.listarPlatillosRecomendados();
    }
    @GetMapping("/{idC}")
    public GenericResponse listarPlatillosPorCategoria(@PathVariable int idC){
        return this.service.listarPlatillosPorCategoria(idC);
    }
}
