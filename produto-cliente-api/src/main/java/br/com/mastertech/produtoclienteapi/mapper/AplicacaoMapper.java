package br.com.mastertech.produtoclienteapi.mapper;

import br.com.mastertech.produtoclienteapi.dto.AplicacaoDTO;
import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import org.springframework.stereotype.Component;

@Component
public class AplicacaoMapper {

    public Aplicacao fromDtoToEntity(AplicacaoDTO dto){
        Aplicacao entity = new Aplicacao();

        entity.setId(dto.getId());
        entity.setMeses(dto.getMeses());
        entity.setValor(dto.getValor());
        entity.setCliente(dto.getCliente());
        entity.setProduto(dto.getProduto());
        return entity;
    }

    public AplicacaoDTO fromEntityToDto(Aplicacao entity){
        AplicacaoDTO dto = new AplicacaoDTO();

        dto.setId(entity.getId());
        dto.setMeses(entity.getMeses());
        dto.setValor(entity.getValor());
        dto.setCliente(entity.getCliente());
        dto.setProduto(entity.getProduto());
        return dto;
    }
}
