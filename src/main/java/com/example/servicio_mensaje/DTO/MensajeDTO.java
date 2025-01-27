package com.example.servicio_mensaje.DTO;


public class MensajeDTO {
    private String mensaje;
    private int puntuacion;

    public MensajeDTO() {}

    public MensajeDTO(String mensaje, int puntuacion) {
        this.mensaje = mensaje;
        this.puntuacion = puntuacion;
    }

    // Getters y Setters corregidos
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) { 
        this.mensaje = mensaje;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
