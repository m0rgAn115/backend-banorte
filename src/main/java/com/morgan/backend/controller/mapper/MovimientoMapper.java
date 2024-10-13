package com.morgan.backend.controller.mapper;


import com.morgan.backend.dto.MovimientoDTO;
import com.morgan.backend.entity.Movimiento;

public class MovimientoMapper {

    public static MovimientoDTO toDTO(Movimiento movimiento) {
        return new MovimientoDTO(
                movimiento.getDescripcion(),
                movimiento.getTipo(),
                movimiento.getMonto(),
                movimiento.getFecha()
        );
    }
}
