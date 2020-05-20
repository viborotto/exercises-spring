package br.com.mastertech.produtoclienteapi.mapper;

import br.com.mastertech.produtoclienteapi.dto.AplicacaoDTO;
import br.com.mastertech.produtoclienteapi.model.Aplicacao;
import org.springframework.stereotype.Component;

@Component
public class AplicacaoMapper {

    public Aplicacao fromDtoToEntity(AplicacaoDTO dto){
        Aplicacao entity = new Aplicacao();

        entity.setId(dto.getId());
        entity.setProduto(dto.getProduto());
        entity.setMeses(dto.getMeses());
        entity.setValor(dto.getValor());

        return entity;
    }

    public AplicacaoDTO fromEntityToDto(Aplicacao entity){
        AplicacaoDTO dto = new AplicacaoDTO();

        dto.setId(entity.getId());
        dto.setProduto(entity.getProduto());
        dto.setMeses(entity.getMeses());
        dto.setValor(entity.getValor());

        return dto;
    }
}
