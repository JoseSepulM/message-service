package com.example.servicio_mensaje.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servicio_mensaje.DTO.MensajeDTO;
import com.example.servicio_mensaje.DTO.PacienteTemperaturaDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RabbitMQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper objectMapper; // Convertirá el objeto a JSON

    private final String QUEUE_NAME = "infoPacientes";

    public void enviarMensaje(MensajeDTO mensajeDTO) {
        try {
            // Convertir el objeto a JSON
            String mensajeJson = objectMapper.writeValueAsString(mensajeDTO);

            // Enviar JSON a RabbitMQ
            rabbitTemplate.convertAndSend(QUEUE_NAME, mensajeJson);
            System.out.println("Mensaje enviado: " + mensajeJson);

        } catch (JsonProcessingException e) {
            System.err.println("Error al convertir el mensaje a JSON: " + e.getMessage());
        }
    }

    public void registrarTemperatura(PacienteTemperaturaDTO dataDto){

        try {
            // Convertir el objeto a JSON
            String mensajeJson = objectMapper.writeValueAsString(dataDto);

            // Enviar JSON a RabbitMQ
            rabbitTemplate.convertAndSend(QUEUE_NAME, mensajeJson);
            System.out.println("Mensaje enviado: " + mensajeJson);

        } catch (JsonProcessingException e) {
            System.err.println("Error al convertir el mensaje a JSON: " + e.getMessage());
        }

    }
}