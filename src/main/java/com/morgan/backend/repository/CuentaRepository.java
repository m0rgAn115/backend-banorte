package com.morgan.backend.repository;



import com.morgan.backend.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

    List<Cuenta> findByIdUsuario(Long idUsuario);

    Cuenta findByClabe(String Clabe);

    @Modifying
    @Transactional
    @Query("UPDATE Cuenta c SET c.saldo = :saldo WHERE c.id = :idCuenta")
    public int updateSaldo(@Param("idCuenta") Long idCuenta, @Param("saldo") Double saldo);
}
