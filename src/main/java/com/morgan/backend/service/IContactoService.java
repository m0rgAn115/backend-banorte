package com.morgan.backend.service;

import com.morgan.backend.entity.Contacto;

import java.util.List;

public interface IContactoService {
    void crearContacto(Contacto contacto);

    List<Contacto> getContactosByUsuarioId(Long id);

    List<Contacto> getContactos();


}
