package com.morgan.backend.controller;

import com.morgan.backend.entity.Contacto;
import com.morgan.backend.entity.Cuenta;
import com.morgan.backend.service.IContactoService;
import com.morgan.backend.service.ICuentasService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/cuentas", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class CuentasController {

    ICuentasService cuentasService;

    @PostMapping("/crear")
    public ResponseEntity<Cuenta> createAccount(@Valid @RequestBody Cuenta cuenta) {
            cuentasService.crearCuenta(cuenta);
            return new ResponseEntity<>(cuenta, HttpStatus.CREATED);

    }

    @GetMapping("/get")
    public ResponseEntity<List<Cuenta>> getCuentas() {
        List<Cuenta> cuentas = cuentasService.getCuentas();
        return ResponseEntity.status(HttpStatus.OK).body(cuentas);
    }

    @GetMapping("/get/usuario/{id}")
    public ResponseEntity<List<Cuenta>> getCuentasByUsuarioID(@PathVariable("id") Long idUsuario) {
        List<Cuenta> cuentas =  cuentasService.getCuentasByUsuarioId(idUsuario);
        return ResponseEntity.status(HttpStatus.OK).body(cuentas);
    }

    @GetMapping("/get/clabe/{clabe}")
    public ResponseEntity<Cuenta> getCuentaByClabe(@PathVariable("clabe") String clabe) {
        Cuenta cuenta =  cuentasService.getCuentaByClabe(clabe);
        return ResponseEntity.status(HttpStatus.OK).body(cuenta);
    }

}
