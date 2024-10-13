package com.morgan.backend.service;

import com.morgan.backend.entity.Cuenta;

import java.util.List;

public interface ICuentasService {
    void crearCuenta(Cuenta cuenta);

    Cuenta getCuentaPorId(Long id);

    List<Cuenta> getCuentasByUsuarioId(Long id);

    Cuenta getCuentaByClabe(String clabe);

    void actualizarSaldo(Long idCuenta, Double saldo);

    List<Cuenta> getCuentas();
}
