package br.com.mastertech.produtoclienteapi.dto;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;

import java.util.List;

public class ClienteDTO {

    private Long id;

    private String nome;

    private String cpf;

    private List<Aplicacao> listaDeAplicacoes;

    public List<Aplicacao> getListaDeAplicacoes() {
        return listaDeAplicacoes;
    }

    public void setListaDeAplicacoes(List<Aplicacao> listaDeAplicacoes) {
        this.listaDeAplicacoes = listaDeAplicacoes;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
