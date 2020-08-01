package com.viborotto.funcionariosapi.services;

import com.viborotto.funcionariosapi.models.Funcionario;
import com.viborotto.funcionariosapi.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public Iterable<Funcionario> buscarTodos() {
        return funcionarioRepository.findAll();
    }

    public void inserir(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public boolean substituir(Long id, Funcionario funcionario) {
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(id);

        funcionario.setId(id);

        if (funcionarioOptional.isPresent()) {
            funcionarioRepository.save(funcionario);
            return true;
        }

        return false;
    }

    public boolean atualizar(Long id, Funcionario funcionario) {
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(id);

        if (funcionarioOptional.isPresent()) {
            funcionario = mesclarAtributos(funcionario, funcionarioOptional.get());

            funcionarioRepository.save(funcionario);
            return true;
        }

        return false;
    }

    public boolean remover(Long id) {
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(id);

        if (funcionarioOptional.isPresent()) {
            funcionarioRepository.delete(funcionarioOptional.get());
            return true;
        }

        return false;
    }

    private Funcionario mesclarAtributos(Funcionario novo, Funcionario antigo) {
        if (novo.getNome() != null && !novo.getNome().isEmpty()) {
            antigo.setNome(novo.getNome());
        }

        if (novo.getEmail() != null && !novo.getEmail().isEmpty()) {
            antigo.setEmail(novo.getEmail());
        }

        return antigo;
    }
}
