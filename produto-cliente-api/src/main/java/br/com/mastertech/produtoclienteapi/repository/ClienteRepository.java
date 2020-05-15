package br.com.mastertech.produtoclienteapi.repository;

import br.com.mastertech.produtoclienteapi.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
