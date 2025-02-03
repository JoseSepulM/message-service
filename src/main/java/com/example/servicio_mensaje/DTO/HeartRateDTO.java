package com.example.servicio_mensaje.DTO;
import java.time.LocalDateTime;

public class HeartRateDTO {

    private Long idPaciente;
    private Double heartRate;
    private LocalDateTime fecha;


    public HeartRateDTO(Long idPaciente, Double heartRate, LocalDateTime fecha){
        this.idPaciente = idPaciente;
        this.heartRate = heartRate;
        this.fecha = fecha;
    }
    
    public Long getIdPaciente() {
        return idPaciente;
    }

    public Double getHeartRate(){
        return heartRate;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public void setIdPaciente(Long idPaciente){
        this.idPaciente = idPaciente;
    }

    public void setHeartRate(Double heartRate){
        this.heartRate = heartRate;
    }

    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }
}
                  