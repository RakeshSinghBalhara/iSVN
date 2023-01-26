package com.blackrock.kafka.consumer.KafkaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "mytopic", groupId = "my_grp", containerFactory = "stringKafkaListenerFactory")
    public void receiveMsgFromKafka(String message) {
        System.out.println("msg received from Kafka:" + message);
    }

}
