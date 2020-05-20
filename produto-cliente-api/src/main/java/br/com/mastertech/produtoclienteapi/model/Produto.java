package br.com.mastertech.produtoclienteapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double rendimento;

    @OneToMany(mappedBy = "produto")
    private List<Aplicacao> listaDeAplicacoes;

    public Produto() {
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
