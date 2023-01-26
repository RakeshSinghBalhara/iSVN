package com.blackrock.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaService kafkaService;

    @GetMapping("/testKafka")
    public String testMessage(){
        kafkaService.sendDataTOkafka("Hi, this is Siri from Haryana");
        return "Message published to Kafka topic";
    }

}
