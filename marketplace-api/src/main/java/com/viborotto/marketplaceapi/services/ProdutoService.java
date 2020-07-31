package com.viborotto.marketplaceapi.services;

import com.viborotto.marketplaceapi.models.Produto;
import com.viborotto.marketplaceapi.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Iterable<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto produtoPeloId(Long id){
        Optional<Produto> optionalProduto = produtoRepository.findById(id);
        return optionalProduto.get();
    }
}
