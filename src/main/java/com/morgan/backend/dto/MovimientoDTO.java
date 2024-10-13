package com.morgan.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovimientoDTO {
    private String descripcion;
    private String tipo;
    private Double monto;
    private Date fecha;
}
