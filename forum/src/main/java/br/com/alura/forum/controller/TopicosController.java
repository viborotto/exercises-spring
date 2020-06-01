package br.com.alura.forum.controller;


import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.dto.TopicoForm;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    //filtrar
    //localhost:8080/topicos?nomeCurso=Spring+Boot
    @GetMapping
    public List<Topico> lista(String nomeCurso){
        if (nomeCurso==null){
            List<Topico> topicos = topicoRepository.findAll();
            return topicos;
        } else {
            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
            return topicos;
        }
    }

    @PostMapping
    public ResponseEntity<Topico> cadastrar(@RequestBody Topico topico, UriComponentsBuilder uriBuilder){

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(topicoRepository.save(topico));
    }
}
