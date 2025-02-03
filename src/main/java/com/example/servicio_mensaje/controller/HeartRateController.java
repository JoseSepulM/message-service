package com.example.servicio_mensaje.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicio_mensaje.DTO.HeartRateDTO;
import com.example.servicio_mensaje.services.RabbitMQSender;

@RestController
@RequestMapping("heart")

public class HeartRateController {

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @PostMapping("/rateRegister")
    public String registrarFrecuencia(@RequestBody HeartRateDTO dataDto){

        rabbitMQSender.registrarFrecuencia(dataDto);
        return "temperatura enviaada a la cola";

    }
    
}
