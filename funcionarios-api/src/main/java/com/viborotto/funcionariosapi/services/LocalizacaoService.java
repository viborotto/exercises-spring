package com.viborotto.funcionariosapi.services;

import com.viborotto.funcionariosapi.models.Localizacao;
import com.viborotto.funcionariosapi.repositories.LocalizacaoRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;

    public Iterable<Localizacao> lerTudo(){
        return localizacaoRepository.findAll();
    }

    public Localizacao ler(Long id){
        Optional<Localizacao> localizacaoOptional = localizacaoRepository.findById(id);
        return localizacaoOptional.get();
    }
}
