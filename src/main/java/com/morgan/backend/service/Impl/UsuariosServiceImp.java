package com.morgan.backend.service.Impl;

import com.morgan.backend.entity.Usuario;
import com.morgan.backend.repository.UsuarioRepository;
import com.morgan.backend.service.IUsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuariosServiceImp implements IUsuariosService {

    private UsuarioRepository usuarioRepository;


    @Override
    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario getUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario no encontrado")
        );
    }
}
