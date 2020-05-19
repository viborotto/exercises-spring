package br.com.mastertech.produtoclienteapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {

    private Long id;

    private String nome;

    private String cpf;
}
