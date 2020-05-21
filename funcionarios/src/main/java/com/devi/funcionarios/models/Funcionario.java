package com.devi.funcionarios.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employees")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String nome;

    @Column(name = "last_name")
    private String sobrenome;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String telefone;

    @Column(name = "hire_date")
    private LocalDate contratacao;

    @Column(name = "salary")
    private Double salario;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Cargo cargo;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Funcionario gerente; //[????]Autorrelacionamento
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departamento departamento;
    @OneToMany(mappedBy = "funcionario")
    private List<Dependentes> dependentes;

    public Funcionario() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getContratacao() {
        return contratacao;
    }

    public void setContratacao(LocalDate contratacao) {
        this.contratacao = contratacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Dependentes> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependentes> dependentes) {
        this.dependentes = dependentes;
    }
}
