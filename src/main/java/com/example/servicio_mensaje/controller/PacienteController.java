package com.example.servicio_mensaje.controller;


import com.example.servicio_mensaje.DTO.PacienteTemperaturaDTO;
import com.example.servicio_mensaje.services.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @PostMapping("/temperatura")
    public String marcarTemperatura(@RequestBody PacienteTemperaturaDTO dataDto){

        rabbitMQSender.registrarTemperatura(dataDto);
        return "temperatura enviaada a la cola";

    }
    
}
