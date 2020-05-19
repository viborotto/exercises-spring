package br.com.mastertech.produtoclienteapi.controller;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import br.com.mastertech.produtoclienteapi.model.Cliente;
import br.com.mastertech.produtoclienteapi.service.AplicacaoService;
import br.com.mastertech.produtoclienteapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AplicacaoController {

    @Autowired
    private AplicacaoService aplicacaoService;

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cliente/{id}/aplicar")
    public Aplicacao aplicar(@PathVariable Long id, @RequestBody Aplicacao aplicacao){
        Cliente cliente = clienteService.buscaClientePorId(id);
        return aplicacaoService.aplicar(cliente, aplicacao);
    }

    @GetMapping("/cliente/{id}/aplicacoes")
    public Iterable<Aplicacao> todasAplicacoes(@PathVariable Long id){
        Cliente cliente = clienteService.buscaClientePorId(id);
        return aplicacaoService.buscaListaAplicacoes(cliente);
    }
}
