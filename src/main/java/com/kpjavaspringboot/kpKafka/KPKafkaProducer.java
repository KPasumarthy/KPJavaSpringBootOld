package com.kpjavaspringboot.kpKafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

//@Service
public class KPKafkaProducer
{
    public static final String topic = "kpKakfaTopic";
    //private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);
    //@Autowired
    //private KafkaTemplate<String, String> kpKafkaTemp;

    //private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        publish2Topic("KP : Kafka Producer Publish : Hello World");

    }

    public static void publish2Topic(String msg) {
        System.out.println("KP : KPJavaSpringBootApplication - Kafka Producer ");
        //logger.info("KP : KPJavaSpringBootApplication - Kafka Producer & Consumer");


        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put("group.id", "myKafkaGroup");

        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(properties);
        ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>("KPKafkaMessageTopic", msg );

        kafkaProducer.send(producerRecord);
        kafkaProducer.close();

    }
}
