package com.devi.funcionarios.controllers;

import com.devi.funcionarios.models.Departamento;
import com.devi.funcionarios.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    public DepartamentoService departamentoService;

    @GetMapping("/listar")
    public Iterable<Departamento> listarDepartamentos(){
        return departamentoService.buscaDepartamentos();
    }
}
