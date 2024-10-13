package com.morgan.backend.service;

import com.morgan.backend.entity.Transaccion;

import java.util.List;

public interface ITransaccionService {
    Transaccion crearTransaccion(Transaccion transaccion);

    Transaccion getTransaccionById(Long id);

    List<Transaccion> getTransaccionesPorClabeEmisor(String clabe);

    List<Transaccion> getTransaccionesPorUsuarioId(Long id);

    List<Transaccion> getTransaccionesPorClabe(String clabe);
}
