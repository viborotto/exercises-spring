package com.viborotto.funcionariosapi.controllers;


import com.viborotto.funcionariosapi.models.Funcionario;
import com.viborotto.funcionariosapi.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping
    public Iterable<Funcionario> listarFuncionarios(){
        return funcionarioService.buscarTodos();
    }

    @PostMapping
    public void inserirFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.inserir(funcionario);
    }

    @PutMapping("/{id}")
    public ResponseEntity substituirFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        boolean resultado = funcionarioService.substituir(id, funcionario);

        if(!resultado) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(funcionario);
    }

    @PatchMapping("/{id}")
    public ResponseEntity atualizarFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        boolean resultado = funcionarioService.atualizar(id, funcionario);

        if(!resultado) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(funcionario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarFuncionario(@PathVariable Long id) {
        boolean resultado = funcionarioService.remover(id);

        if(!resultado) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().build();
    }
}
