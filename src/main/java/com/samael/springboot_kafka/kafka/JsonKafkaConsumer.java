package com.samael.springboot_kafka.kafka;

import com.samael.springboot_kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);


    @KafkaListener(topics = "samael_json", groupId = "muGroup")
    public void consume(User user){
        LOGGER.info(String.format("Message Received %s",user.toString()));


    }
}
