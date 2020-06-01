package br.com.alura.forum.repositories;

import br.com.alura.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    //atributo de Curso que é relacionamento de Topico
    List<Topico> findByCursoNome(String nomeCurso);
}
