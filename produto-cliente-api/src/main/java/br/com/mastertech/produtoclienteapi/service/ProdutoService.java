package br.com.mastertech.produtoclienteapi.service;

import br.com.mastertech.produtoclienteapi.model.Produto;
import br.com.mastertech.produtoclienteapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto buscaPorId(Long id){
        Optional<Produto> optionalProduto= produtoRepository.findById(id);

        return optionalProduto.get();
    }

    public Iterable<Produto> buscaListaProdutos(){
         return produtoRepository.findAll();
    }
}
