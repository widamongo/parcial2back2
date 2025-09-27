package com.example.parcial2.modelo;

import com.example.parcial2.Sala;

public class SalaMapper {
    public static SalaDTO toDTO(Sala sala) {
        SalaDTO dto = new SalaDTO();
        dto.setId(sala.getId());
        dto.setNombre(sala.getNombre());
        dto.setCapacidad(sala.getCapacidad());
        dto.setTipo(sala.getTipo());
        dto.setCineId(sala.getCine() != null ? sala.getCine().getId() : null);
        return dto;
    }

    public static Sala toEntity(SalaDTO dto) {
        Sala sala = new Sala();
        sala.setId(dto.getId());
        sala.setNombre(dto.getNombre());
        sala.setCapacidad(dto.getCapacidad());
        sala.setTipo(dto.getTipo());
        // El cine debe ser seteado aparte en el servicio
        return sala;
    }
}