package com.viborotto.funcionariosapi.repositories;

import com.viborotto.funcionariosapi.models.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario,Long> {
}
