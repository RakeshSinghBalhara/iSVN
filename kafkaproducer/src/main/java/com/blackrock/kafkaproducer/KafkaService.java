package com.blackrock.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void  sendDataTOkafka(String message){
        kafkaTemplate.send("mytopic",message);
    }

}
