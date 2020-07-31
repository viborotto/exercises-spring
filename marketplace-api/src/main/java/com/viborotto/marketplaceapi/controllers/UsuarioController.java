package com.viborotto.marketplaceapi.controllers;

import com.viborotto.marketplaceapi.models.Usuario;
import com.viborotto.marketplaceapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    @PostMapping("/usuarios")
    public ResponseEntity<?> postUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.criarUsuario(usuario));
    }

    @GetMapping("/usuarios")
    public ResponseEntity<?> getUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listarUsuarios());
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<?> getUsuariosById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.usuarioById(id));
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteUsuariosById(@PathVariable Long id){
        usuarioService.deletarUsuarioById(id);
    }
}
