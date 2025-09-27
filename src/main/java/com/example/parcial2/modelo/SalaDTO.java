package com.example.parcial2.modelo;

public class SalaDTO {
    private Long id;
    private String nombre;
    private Integer capacidad;
    private String tipo;
    private Long cineId;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Long getCineId() { return cineId; }
    public void setCineId(Long cineId) { this.cineId = cineId; }
}