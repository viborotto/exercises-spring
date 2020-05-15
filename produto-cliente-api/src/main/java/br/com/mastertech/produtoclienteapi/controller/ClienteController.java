package br.com.mastertech.produtoclienteapi.controller;

import br.com.mastertech.produtoclienteapi.dto.ClienteDTO;
import br.com.mastertech.produtoclienteapi.mapper.ClienteMapper;
import br.com.mastertech.produtoclienteapi.model.Cliente;
import br.com.mastertech.produtoclienteapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteMapper clienteMapper;

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO criarCliente(@RequestBody ClienteDTO dto){
        Cliente cliente = clienteMapper.fromDtoToEntity(dto);

        cliente = clienteService.criarCliente(cliente);
        return clienteMapper.fromEntityToDto(cliente);
    }

    @GetMapping("cliente/{id}")
    public ClienteDTO clientePorId(@PathVariable Long id, ClienteDTO dto){
        Cliente cliente = clienteService.buscaClientePorId(id);
        return clienteMapper.fromEntityToDto(cliente);
    }

    @PutMapping("atualizacliente/{id}")
    public ClienteDTO atualizaDadosCliente(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO){
        Cliente cliente = clienteMapper.fromDtoToEntity(clienteDTO);
        cliente = clienteService.atualizaCliente(id, cliente);
        return clienteMapper.fromEntityToDto(cliente);
    }

}
