package com.morgan.backend.repository;

import com.morgan.backend.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {

    List<Transaccion> findByIdUsuario(Long idUsuario);

    List<Transaccion> findByClabeEmisor(String Clabe);


}
