package com.example.servicio_mensaje.DTO;


import java.time.LocalDateTime;

public class PacienteTemperaturaDTO {

    private Long idPaciente;
    private Double temperatura;
    private LocalDateTime fecha;

    // Constructor vacío
    public PacienteTemperaturaDTO() {}

    // Constructor con todos los campos
    public PacienteTemperaturaDTO(Long idPaciente, Double temperatura, LocalDateTime fecha) {
        this.idPaciente = idPaciente;
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
