package com.blackrock.kafka.consumer.KafkaConsumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class KafkaConfig {

    @Bean
    public ConsumerFactory<String,String> stringConsumerFactory() {
        Map<String, Object> props = new HashMap<>();

        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG,"my_grp");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"earliest");
        return new DefaultKafkaConsumerFactory<>(props);
    }

    @Bean(name="stringKafkaListenerFactory")
    public ConcurrentKafkaListenerContainerFactory<String,String> stringKafkaListenerFactory(){
        ConcurrentKafkaListenerContainerFactory<String,String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(stringConsumerFactory());
        return factory;
    }
}
