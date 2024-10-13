package com.morgan.backend.service.Impl;

import com.morgan.backend.entity.Cuenta;
import com.morgan.backend.repository.CuentaRepository;
import com.morgan.backend.service.ICuentasService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CuentasServiceImp implements ICuentasService {

    private final CuentaRepository cuentaRepository;

    @Override
    public void crearCuenta(Cuenta cuenta) {
        cuentaRepository.save(cuenta);
    }

    @Override
    public Cuenta getCuentaPorId(Long id) {
        return cuentaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario no encontrado")
        );
    }

    @Override
    public List<Cuenta> getCuentasByUsuarioId(Long id) {
        List<Cuenta> cuentas = cuentaRepository.findByIdUsuario(id);

        if(cuentas.isEmpty()) {
            throw new RuntimeException("Usuario no encontrado");
        }else
            return cuentas;
    }

    @Override
    public Cuenta getCuentaByClabe(String clabe) {
        Cuenta cuenta = cuentaRepository.findByClabe(clabe);

        if(cuenta == null) {
            throw new RuntimeException("No hay cuenta con la clabe especificada");
        }else
            return cuenta;
    }

    @Override
    public void actualizarSaldo(Long idCuenta, Double saldo) {
        try {
            int rowsUpdated = cuentaRepository.updateSaldo(idCuenta, saldo);
            if (rowsUpdated == 0) {
                throw new RuntimeException("No se encontró la cuenta con el ID especificado");
            }
        } catch (Exception e) {
            throw new RuntimeException("Error actualizando saldo", e);
        }
    }

    @Override
    public List<Cuenta> getCuentas() {
        return cuentaRepository.findAll();
    }

}
