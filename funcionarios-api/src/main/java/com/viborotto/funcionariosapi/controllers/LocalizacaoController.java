package com.viborotto.funcionariosapi.controllers;


import com.viborotto.funcionariosapi.models.Localizacao;
import com.viborotto.funcionariosapi.services.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {

    @Autowired
    LocalizacaoService localizacaoService;

    @GetMapping
    public Iterable<Localizacao> getAll(){
        return localizacaoService.lerTudo();
    }
}
