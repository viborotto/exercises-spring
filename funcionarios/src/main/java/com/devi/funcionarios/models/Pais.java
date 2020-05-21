package com.devi.funcionarios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "countries")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long id;

    @Column(name = "country_name")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Regiao regiao;
    @OneToMany(mappedBy = "pais")
    private List<Localizacao> listaLocalizacao;

    public Pais() {
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

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public List<Localizacao> getListaLocalizacao() {
        return listaLocalizacao;
    }

    public void setListaLocalizacao(List<Localizacao> listaLocalizacao) {
        this.listaLocalizacao = listaLocalizacao;
    }
}
