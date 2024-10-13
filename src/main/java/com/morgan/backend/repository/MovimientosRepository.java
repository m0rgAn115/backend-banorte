package com.morgan.backend.repository;


import com.morgan.backend.entity.Movimiento;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

@Repository
public interface MovimientosRepository extends JpaRepository<Movimiento, Long> {
    List<Movimiento> getMovimientosByIdUsuario(Long id);
    List<Movimiento> getMovimientosByIdCuenta(Long idCuenta);
}
