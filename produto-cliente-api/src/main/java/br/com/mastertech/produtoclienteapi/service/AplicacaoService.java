package br.com.mastertech.produtoclienteapi.service;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import br.com.mastertech.produtoclienteapi.repository.AplicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AplicacaoService {

    @Autowired
    private AplicacaoRepository aplicacaoRepository;

    public Aplicacao aplicar(Aplicacao aplicacao){
        return aplicacaoRepository.save(aplicacao);
    }

    public Aplicacao aplicacaoPorId(Long id){
        Optional<Aplicacao> optionalAplicacao = aplicacaoRepository.findById(id);

        return optionalAplicacao.get();
    }

    public Iterable<Aplicacao> buscaListaAplicacoes(){
        return aplicacaoRepository.findAll();
    }
}
