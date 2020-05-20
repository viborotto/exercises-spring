package br.com.mastertech.produtoclienteapi.service;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import br.com.mastertech.produtoclienteapi.model.Cliente;
import br.com.mastertech.produtoclienteapi.repository.AplicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AplicacaoService {

    @Autowired
    private AplicacaoRepository aplicacaoRepository;

    public Aplicacao aplicar(Cliente cliente, Aplicacao aplicacao){
        aplicacao.setCliente(cliente);
        return aplicacaoRepository.save(aplicacao);
    }

    public Iterable<Aplicacao> buscaListaAplicacoes(Cliente cliente){
        return cliente.getListaDeAplicacoes();
    }
}
