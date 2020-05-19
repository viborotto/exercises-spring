package br.com.mastertech.produtoclienteapi.dto;

import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClienteDTO {

    private Long id;

    private String nome;

    private String cpf;

    private List<Aplicacao> listaDeAplicacoes;
}
