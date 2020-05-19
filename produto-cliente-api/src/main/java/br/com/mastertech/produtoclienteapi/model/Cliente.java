package br.com.mastertech.produtoclienteapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Aplicacao> listaDeAplicacoes;

    public Cliente() {
    }
}
