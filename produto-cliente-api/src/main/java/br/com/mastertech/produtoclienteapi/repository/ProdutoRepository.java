package br.com.mastertech.produtoclienteapi.repository;

import br.com.mastertech.produtoclienteapi.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
