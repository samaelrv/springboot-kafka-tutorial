package com.samael.springboot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;
    @Bean
    public NewTopic createTopic(){
        return TopicBuilder.name(topicName)
                .build();
    }

    @Bean
    public NewTopic createJSONTopic(){
        return TopicBuilder.name("samael_json")
                .build();
    }
}
