
package com.morgan.backend.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    @Size(min = 4, message = "La contraseña debe contener al menos 4 dígitos.")
    private String pass;
    @Column(nullable = false)

    private String email;

}
