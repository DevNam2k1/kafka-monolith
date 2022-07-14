package com.devnam2k1.springbootprometheus.controller;

import com.devnam2k1.springbootprometheus.kafka.JsonKafkaProducer;
import com.devnam2k1.springbootprometheus.payload.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 10:14 AM
 * Project Name:  app
 */
@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class JsonMessageController {

    private final JsonKafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to Kafka topic");
    }
}
