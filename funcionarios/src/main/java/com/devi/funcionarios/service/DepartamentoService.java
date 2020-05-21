package com.devi.funcionarios.service;

import com.devi.funcionarios.models.Departamento;
import com.devi.funcionarios.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    //ler
    public Iterable<Departamento> buscaDepartamentos(){
        return departamentoRepository.findAll();
    }
}
