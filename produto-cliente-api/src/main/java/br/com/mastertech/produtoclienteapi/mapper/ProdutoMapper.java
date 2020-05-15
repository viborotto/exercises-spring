package br.com.mastertech.produtoclienteapi.mapper;

import br.com.mastertech.produtoclienteapi.dto.ProdutoDTO;
import br.com.mastertech.produtoclienteapi.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto fromDtoToEntity(ProdutoDTO dto){
        Produto entity = new Produto();

        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setRendimento(dto.getRendimento());
        return entity;
    }

    public ProdutoDTO fromEntityToDto(Produto entity){
        ProdutoDTO dto = new ProdutoDTO();

        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setRendimento(entity.getRendimento());
        return dto;
    }
}
