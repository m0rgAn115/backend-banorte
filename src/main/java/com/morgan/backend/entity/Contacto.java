
package com.morgan.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contacto  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "id_usuario")
    private Long idUsuarioCreador;

    @NotNull
    private String alias;

    @NotNull
    private Long idCuentaContacto;

}
