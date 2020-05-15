package br.com.mastertech.produtoclienteapi.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL) //lista de aplicacoes
    private List<Aplicacao> listaDeAplicacoes = new ArrayList<>();

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
