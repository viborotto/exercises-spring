package com.viborotto.marketplaceapi.services;


import com.viborotto.marketplaceapi.models.Usuario;
import com.viborotto.marketplaceapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Iterable<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario usuarioById(Long id){
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        return optionalUsuario.get();
    }

    public void deletarUsuarioById(Long id){
        usuarioRepository.deleteById(id);
    }
}
