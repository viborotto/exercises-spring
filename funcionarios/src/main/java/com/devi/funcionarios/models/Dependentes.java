package com.devi.funcionarios.models;

import javax.persistence.*;

@Entity
@Table(name = "dependents")
public class Dependentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dependent_id")
    private Long id;

    @Column(name = "first_name")
    private String nome;

    @Column(name = "last_name")
    private String sobrenome;

    @Column(name = "relationship")
    private String estadoCivil;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Funcionario funcionario;

    public Dependentes() {
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
