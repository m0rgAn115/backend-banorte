package com.morgan.backend.service;


import com.morgan.backend.entity.Usuario;

public interface IUsuariosService {
    void crearUsuario(Usuario usuario);

    Usuario getUsuarioPorId(Long id);
}
