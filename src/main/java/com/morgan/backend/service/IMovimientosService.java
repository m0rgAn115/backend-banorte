package com.morgan.backend.service;

import com.morgan.backend.entity.Movimiento;

import java.util.List;

public interface IMovimientosService {
    void crearMovimiento(Movimiento movimiento);
    List<Movimiento> getMovimientosByIdUsuario(Long idUsuario);
    List<Movimiento> getMovimientosByIdCuenta(Long idCuenta);
}
