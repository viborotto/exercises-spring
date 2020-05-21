package com.devi.funcionarios.repositories;

import com.devi.funcionarios.models.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {
}
