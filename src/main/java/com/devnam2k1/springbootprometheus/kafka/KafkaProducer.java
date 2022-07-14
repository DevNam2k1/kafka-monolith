package com.devnam2k1.springbootprometheus.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 9:17 AM
 * Project Name:  app
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info(String.format("Message sent %s", message));
        kafkaTemplate.send("devnam2k1", message);
    }
}
