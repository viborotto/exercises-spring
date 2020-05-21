package com.devi.funcionarios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locations")
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long id;

    @Column(name = "street_address")
    private String logadouro;

    @Column(name = "city")
    private String cidade;

    @Column(name = "postal_code")
    private String cep;

    @Column(name = "state_province")
    private String estado;

    @OneToMany(mappedBy = "localizacao")
    private List<Departamento> departamentos;
    @ManyToOne
    @JoinColumn(name = "country _id")
    private Pais pais;

    public Localizacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
