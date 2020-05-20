package br.com.mastertech.produtoclienteapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Aplicacao> listaDeAplicacoes;

    public Cliente(String nome, String cpf, List<Aplicacao> listaDeAplicacoes) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaDeAplicacoes = listaDeAplicacoes;
    }

    public Cliente() {
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

    public List<Aplicacao> getListaDeAplicacoes() {
        return listaDeAplicacoes;
    }

    public void setListaDeAplicacoes(List<Aplicacao> listaDeAplicacoes) {
        this.listaDeAplicacoes = listaDeAplicacoes;
    }
}
