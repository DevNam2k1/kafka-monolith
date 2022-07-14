package com.devnam2k1.springbootprometheus.kafka;

import com.devnam2k1.springbootprometheus.payload.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 10:03 AM
 * Project Name:  app
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class JsonKafkaConsumer {

    @KafkaListener(topics = "devnam2k1_json", groupId = "myGroup")
    private void consume(User user){
        log.info(String.format("Json message received --> %s", user.toString()));
    }
}
