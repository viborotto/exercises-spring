package br.com.mastertech.produtoclienteapi.dto;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;

import java.util.List;

public class ProdutoDTO {

    private Long id;

    private String nome;

    private Double rendimento;

    private List<Aplicacao> listaDeAplicacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendimento() {
        return rendimento;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }

    public List<Aplicacao> getListaDeAplicacoes() {
        return listaDeAplicacoes;
    }

    public void setListaDeAplicacoes(List<Aplicacao> listaDeAplicacoes) {
        this.listaDeAplicacoes = listaDeAplicacoes;
    }
}
