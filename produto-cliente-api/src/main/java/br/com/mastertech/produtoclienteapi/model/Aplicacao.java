package br.com.mastertech.produtoclienteapi.model;

import javax.persistence.*;

@Entity
public class Aplicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valor;

    private Integer meses;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Cliente cliente;

    public Aplicacao() {
    }

    public Aplicacao(Produto produto, Double valor, Integer meses) {
        this.produto = produto;
        this.valor = valor;
        this.meses = meses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
