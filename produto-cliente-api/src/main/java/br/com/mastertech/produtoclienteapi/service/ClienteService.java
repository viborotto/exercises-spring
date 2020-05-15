package br.com.mastertech.produtoclienteapi.service;

import br.com.mastertech.produtoclienteapi.mapper.ClienteMapper;
import br.com.mastertech.produtoclienteapi.model.Cliente;
import br.com.mastertech.produtoclienteapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente buscaClientePorId(Long id){
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        return optionalCliente.get();
    }

    public Cliente atualizaCliente(Long id, Cliente cliente){
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        optionalCliente.get().setCpf(cliente.getCpf());
        optionalCliente.get().setNome(cliente.getCpf());
        return clienteRepository.save(optionalCliente.get());
    }

//    public Iterable<Cliente> buscaListaClientes(){
//        return clienteRepository.findAll();
//    }
}
