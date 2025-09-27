package com.example.parcial2.repository;

import com.example.parcial2.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CineRepository extends JpaRepository<Cine, Long> {
    // Consulta personalizada: buscar cines por nombre
    List<Cine> findByNombreContainingIgnoreCase(String nombre);
}