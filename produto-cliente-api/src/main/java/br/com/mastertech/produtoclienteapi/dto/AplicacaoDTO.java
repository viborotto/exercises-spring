package br.com.mastertech.produtoclienteapi.dto;

import br.com.mastertech.produtoclienteapi.model.Cliente;
import br.com.mastertech.produtoclienteapi.model.Produto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AplicacaoDTO {

    private Long id;

    private Double valor;

    private Integer meses;

    private Produto produto;

    private Cliente cliente;
}
