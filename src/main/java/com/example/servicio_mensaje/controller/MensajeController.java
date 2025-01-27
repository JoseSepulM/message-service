package com.example.servicio_mensaje.controller;

import com.example.servicio_mensaje.DTO.MensajeDTO;
import com.example.servicio_mensaje.services.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class MensajeController {

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @PostMapping("/Paciente")
    public String enviarMensaje(@RequestBody MensajeDTO mensajeDTO) {
        rabbitMQSender.enviarMensaje(mensajeDTO);
        return "Mensaje enviado a la cola!";
    }
}