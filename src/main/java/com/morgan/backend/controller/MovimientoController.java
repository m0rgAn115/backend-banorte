package com.morgan.backend.controller;

import com.morgan.backend.controller.mapper.MovimientoMapper;
import com.morgan.backend.dto.MovimientoDTO;
import com.morgan.backend.entity.Movimiento;
import com.morgan.backend.repository.MovimientosRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/movimientos", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class MovimientoController {

    private final MovimientosRepository movimientosRepository;

    @PostMapping("/crear")
    public ResponseEntity<Movimiento> crearMovimiento(@Valid @RequestBody Movimiento movimiento){
        movimientosRepository.save(movimiento);
        return new ResponseEntity<>(movimiento, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Movimiento>> getTransacciones() {
        List<Movimiento> transacciones = movimientosRepository.findAll();
        return ResponseEntity.ok(transacciones);
    }

    @GetMapping("/get/dto/usuario/{id}")
    public ResponseEntity<List<MovimientoDTO>> getTransaccionesDtoByUsuario(@PathVariable("id") Long idUsuario) {
        List<MovimientoDTO> movimientos = movimientosRepository.getMovimientosByIdUsuario(idUsuario)
                .stream()
                .map(MovimientoMapper::toDTO)
                .toList();

        return ResponseEntity.ok(movimientos);
    }

    @GetMapping("/get/usuario/{id}")
    public ResponseEntity<List<Movimiento>> getTransaccionesByUsuarioId(@PathVariable("id") Long idUsuario) {
        List<Movimiento> transacciones = movimientosRepository.getMovimientosByIdUsuario(idUsuario);
        return ResponseEntity.ok(transacciones);
    }

    @GetMapping("/get/cuenta/{id}")
    public ResponseEntity<List<Movimiento>> getCuentasByUsuarioID(@PathVariable("id") Long id) {
        List<Movimiento> transaccions = movimientosRepository.getMovimientosByIdCuenta(id);
        return ResponseEntity.ok(transaccions);
    }
}
