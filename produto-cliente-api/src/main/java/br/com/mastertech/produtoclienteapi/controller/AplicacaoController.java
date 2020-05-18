package br.com.mastertech.produtoclienteapi.controller;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import br.com.mastertech.produtoclienteapi.service.AplicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AplicacaoController {

    @Autowired
    private AplicacaoService aplicacaoService;

    //id do cliente?

    @PostMapping("/cliente/aplicar")
    public Aplicacao aplicar(@RequestBody Aplicacao aplicacao){
        return aplicacaoService.aplicar(aplicacao);
    }

    @GetMapping("/cliente/aplicacoes")
    public Iterable<Aplicacao> todasAplicacoes(@PathVariable Long id){
        return aplicacaoService.buscaListaAplicacoes();
    }
}
