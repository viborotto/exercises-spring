package com.devi.funcionarios.repositories;

import com.devi.funcionarios.models.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
