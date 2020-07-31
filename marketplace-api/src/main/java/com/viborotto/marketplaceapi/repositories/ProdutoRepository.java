package com.viborotto.marketplaceapi.repositories;

import com.viborotto.marketplaceapi.models.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
