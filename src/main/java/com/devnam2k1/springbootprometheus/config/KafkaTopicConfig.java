package com.devnam2k1.springbootprometheus.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Create by Nam Ga Sky
 * Date: 7/13/2022
 * Time: 9:13 AM
 * Project Name:  app
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("devnam2k1")
                .build();
    }

    @Bean
    public NewTopic newTopic2(){
        return TopicBuilder.name("devnam2k1_json")
                .build();
    }
}
