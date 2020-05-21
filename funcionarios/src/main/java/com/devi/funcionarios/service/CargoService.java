package com.devi.funcionarios.service;

import com.devi.funcionarios.models.Cargo;
import com.devi.funcionarios.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoService {

    @Autowired
    public CargoRepository cargoRepository;

    //ler
    public Iterable<Cargo> buscaCargos(){
        return cargoRepository.findAll();
    }

    //inserir
}
