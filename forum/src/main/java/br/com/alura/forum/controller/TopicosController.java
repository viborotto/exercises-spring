package br.com.alura.forum.controller;


import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<Topico> lista(){
        Topico topico1 = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));
        return Arrays.asList(topico1, topico1, topico1);
    }
}
