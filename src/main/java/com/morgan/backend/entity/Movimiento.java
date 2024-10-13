package com.morgan.backend.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private Long idUsuario;

    @NotNull
    private Long idCuenta;

    @NotNull
    private Long idTransaccion;

    @NotNull
    private String descripcion;

    @Pattern(regexp = "^(Transferencia|Retiro|Deposito|Pago|Compra)$", message = "El tipo debe ser 'Transferencia', 'Retiro', 'Deposito' o 'Pago'.")
    @NotNull
    private String tipo;

    @NotNull
    Double monto;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha", updatable = false)
    private Date fecha;

    public Movimiento(Long idUsuario, Long idCuenta, String tipo, Double monto, Long idTransaccion, String descripcion) {
        this.idUsuario = idUsuario;
        this.idCuenta = idCuenta;
        this.tipo = tipo;
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.descripcion = descripcion;
    }

}
