package com.devi.funcionarios.controllers;

import com.devi.funcionarios.models.Localizacao;
import com.devi.funcionarios.service.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {

    @Autowired
    public LocalizacaoService localizacaoService;

    @GetMapping("/listarLocalizacao")
    public Iterable<Localizacao> listarLocalizacoes(){
        return localizacaoService.buscarTodos();
    }
}
