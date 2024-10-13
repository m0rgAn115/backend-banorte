package com.morgan.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cuenta  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "id_usuario")
    private Long idUsuario;

    @NotNull
    private String nombre;

    @NotNull
    @Pattern(regexp = "\\d{18}", message = "La CLABE debe contener exactamente 18 dígitos numéricos.")
    private String clabe;

    @NotNull
    @Pattern(regexp = "\\d{10}", message = "El numero de cuenta debe contener exactamente 10 dígitos numéricos.")
    private String numero_cuenta;
    private String alias;

    @NotNull
    private Double saldo;

    @NotNull
    @Pattern(regexp = "^(Debito|Credito|Ahorro|Inversion)$", message = "El tipo debe ser 'Debito', 'Credito', 'Ahorro' o 'Inversion'.")
    private String tipo;
    @NotNull
    private boolean estatus;

}
