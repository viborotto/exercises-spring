package br.com.alura.forum.controller;


import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<Topico> lista(){
        List<Topico> topicos = topicoRepository.findAll();
        return topicos;
    }
}
