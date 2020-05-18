package br.com.mastertech.produtoclienteapi.service;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import br.com.mastertech.produtoclienteapi.model.Cliente;
import br.com.mastertech.produtoclienteapi.repository.AplicacaoRepository;
import br.com.mastertech.produtoclienteapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AplicacaoService {

    @Autowired
    private AplicacaoRepository aplicacaoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public Aplicacao aplicar(Cliente cliente, Aplicacao aplicacao){
        cliente.getListaDeAplicacoes().add(aplicacao);
        return aplicacaoRepository.save(aplicacao);
    }

    public Aplicacao aplicacaoPorId(Long id){
        Optional<Aplicacao> optionalAplicacao = aplicacaoRepository.findById(id);

        return optionalAplicacao.get();
    }

    public Iterable<Aplicacao> buscaListaAplicacoes(Cliente cliente){
        return cliente.getListaDeAplicacoes();
    }
}
