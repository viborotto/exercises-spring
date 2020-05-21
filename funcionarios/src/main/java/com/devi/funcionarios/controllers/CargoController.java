package com.devi.funcionarios.controllers;

import com.devi.funcionarios.models.Cargo;
import com.devi.funcionarios.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    public CargoService cargoService;

    @GetMapping("/listar")
    public Iterable<Cargo> listarCargos(){
        return cargoService.buscaCargos();
    }
}
