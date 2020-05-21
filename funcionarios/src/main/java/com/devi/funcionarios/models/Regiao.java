package com.devi.funcionarios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "regions")
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Long id;

    @Column(name = "region_name")
    private String nome;

    @OneToMany(mappedBy = "regiao")
    private List<Pais> listaDePaises;

    public Regiao() {
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

    public List<Pais> getListaDePaises() {
        return listaDePaises;
    }

    public void setListaDePaises(List<Pais> listaDePaises) {
        this.listaDePaises = listaDePaises;
    }
}
