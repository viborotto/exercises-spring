package com.viborotto.marketplaceapi.repositories;

import com.viborotto.marketplaceapi.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
