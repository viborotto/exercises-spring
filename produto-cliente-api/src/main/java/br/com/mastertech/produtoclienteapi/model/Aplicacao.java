package br.com.mastertech.produtoclienteapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Aplicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valor;

    private Integer meses;

    @ManyToOne
    private Produto produto;

    @JsonIgnore
    @ManyToOne
    private Cliente cliente;

    public Aplicacao() {
    }

    public Aplicacao(Produto produto, Double valor, Integer meses) {
        this.produto = produto;
        this.valor = valor;
        this.meses = meses;
    }
}
