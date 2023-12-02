package com.kpjavaspringboot.kpKafka;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.kpjavaspringboot.KPJavaSpringBootApplication;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;


//@Service
public class KPKafkaConsumer {

    //private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        consumeFromTopic("KP : Read");

        }

    //@KafkaListener(topics="KPKafkaMessageTopic")
    public static void consumeFromTopic(String message) {
        System.out.println("KP : KPJavaSpringBootApplication - Kafka Consumer : Message Consumed : " + message);
        //logger.info("KP : KPJavaSpringBootApplication - Kafka Consumer : Message Consumed : " + message);

        String bootStrapServers = "127.0.0.1:9092";
        String goupdId = "myKakfaGroupId";
        String topic = "KPKafkaMessageTopic";

        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put("group.id", "myKafkaGroup");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(properties);
        kafkaConsumer.subscribe(Arrays.asList("KPKafkaMessageTopic"));
        kafkaConsumer.commitAsync();
        ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(Duration.ofMillis(1001));

        while(true){
            for (ConsumerRecord<String, String> consumerRecord : consumerRecords){
                System.out.println("Key : " + consumerRecord.key() + ", Value : " + consumerRecord.value());
                System.out.println("Partition : " + consumerRecord.partition() + ", Offset : " + consumerRecord.offset());
            }
        }
    }
}
