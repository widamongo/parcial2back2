package com.example.parcial2.repository;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleCineRepository extends JpaRepository<DetalleCine, Long> {
    // Consulta personalizada: buscar detalle por ciudad
    DetalleCine findByCiudad(String ciudad);
}