package com.viborotto.funcionariosapi.controllers;

import com.viborotto.funcionariosapi.models.Cargo;
import com.viborotto.funcionariosapi.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    CargoRepository cargoRepository;

    @GetMapping
    public Iterable<Cargo> listarLocalizacoes(){
        return cargoRepository.findAll();
    }

    @PostMapping
    public void inserirCargo(@RequestBody Cargo cargo) {
        cargoRepository.save(cargo);
    }
}
