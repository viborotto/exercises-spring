package com.devi.funcionarios.service;

import com.devi.funcionarios.models.Localizacao;
import com.devi.funcionarios.repositories.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    //ler localizacao
    public Iterable<Localizacao> buscarTodos(){
        return localizacaoRepository.findAll();
    }
}
