package br.com.mastertech.produtoclienteapi.mapper;

import br.com.mastertech.produtoclienteapi.dto.ClienteDTO;
import br.com.mastertech.produtoclienteapi.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente fromDtoToEntity(ClienteDTO dto){
        Cliente entity = new Cliente();

        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setCpf(dto.getCpf());
        entity.setListaDeAplicacoes(dto.getListaDeAplicacoes());
        return entity;
    }

    public ClienteDTO fromEntityToDto(Cliente entity){
        ClienteDTO dto = new ClienteDTO();

        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setCpf(entity.getCpf());
        dto.setListaDeAplicacoes(entity.getListaDeAplicacoes());
        return dto;
    }

}
