package com.morgan.backend.service.Impl;

import com.morgan.backend.entity.Movimiento;
import com.morgan.backend.repository.MovimientosRepository;
import com.morgan.backend.service.IMovimientosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovimientosServiceImp implements IMovimientosService {

    private final MovimientosRepository movimientosRepository;

    @Override
    public void crearMovimiento(Movimiento movimiento) {
        movimientosRepository.save(movimiento);
    }

    @Override
    public List<Movimiento> getMovimientosByIdUsuario(Long id) {
        return movimientosRepository.getMovimientosByIdUsuario(id);
    }

    @Override
    public List<Movimiento> getMovimientosByIdCuenta(Long idCuenta) {
        return movimientosRepository.getMovimientosByIdCuenta(idCuenta);
    }
}
