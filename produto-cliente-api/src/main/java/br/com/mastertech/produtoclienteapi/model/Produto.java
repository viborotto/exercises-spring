package br.com.mastertech.produtoclienteapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double rendimento;

    @OneToMany(mappedBy = "produto")
    private List<Aplicacao> listaDeAplicacoes;

    public Produto() {
    }
}
