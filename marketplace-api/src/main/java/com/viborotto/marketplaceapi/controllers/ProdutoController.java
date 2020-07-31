package com.viborotto.marketplaceapi.controllers;

import com.viborotto.marketplaceapi.models.Produto;
import com.viborotto.marketplaceapi.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produtos")
    public ResponseEntity<?> postProduto(@RequestBody Produto produto){
        return ResponseEntity.ok().body(produtoService.criarProduto(produto));
    }

    @GetMapping("/produtos")
    public ResponseEntity<?> getProdutos(){
        return ResponseEntity.ok().body(produtoService.listarProdutos());
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<?> getProduto(@PathVariable Long id){
        return ResponseEntity.ok().body(produtoService.produtoPeloId(id));
    }

    @DeleteMapping("/produtos/{id}")
    public void deleteProduto(@PathVariable Long id){
        produtoService.deleteProdutoPeloId(id);
    }

}
