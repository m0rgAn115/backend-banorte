package com.morgan.backend.controller;

import com.morgan.backend.entity.Usuario;
import com.morgan.backend.service.IUsuariosService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/usuarios", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class UsuariosController {

    IUsuariosService usuarioService;

    @PostMapping("/crear")
    public ResponseEntity<Usuario> createAccount(@Valid @RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usuario);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Usuario> getAccount(@PathVariable("id") Long idUsuario) {
        Usuario usuario = usuarioService.getUsuarioPorId(idUsuario);

        return ResponseEntity.ok(usuario);
    }
}
