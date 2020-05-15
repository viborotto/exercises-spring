package br.com.mastertech.produtoclienteapi.controller;

import br.com.mastertech.produtoclienteapi.dto.ProdutoDTO;
import br.com.mastertech.produtoclienteapi.mapper.ProdutoMapper;
import br.com.mastertech.produtoclienteapi.model.Produto;
import br.com.mastertech.produtoclienteapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoMapper produtoMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private ProdutoDTO criar(@RequestBody ProdutoDTO dto){
        Produto entity = produtoMapper.fromDtoToEntity(dto);
        entity = produtoService.criarProduto(entity);
        return produtoMapper.fromEntityToDto(entity);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private ProdutoDTO produtoPorId(@PathVariable Long id, ProdutoDTO dto){
        Produto entity = produtoMapper.fromDtoToEntity(dto);
        entity = produtoService.buscaPorId(id);
        return produtoMapper.fromEntityToDto(entity);
    }

}
