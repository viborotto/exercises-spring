package com.devi.funcionarios.service;


import com.devi.funcionarios.models.Funcionario;
import com.devi.funcionarios.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    public FuncionarioRepository funcionarioRepository;

    //TODO ler, inserir, atualizar, deletar
    public Iterable<Funcionario> buscaFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public Funcionario inserir(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }
}
