package com.devnam2k1.springbootprometheus.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 9:45 AM
 * Project Name:  app
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {


    @KafkaListener(topics = "devnam2k1", groupId = "myGroup")
    public void consume(String message){
      log.info(String.format("Message received -> %s", message));
    }
}
