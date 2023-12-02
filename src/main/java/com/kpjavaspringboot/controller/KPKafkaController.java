package com.kpjavaspringboot.controller;

import com.kpjavaspringboot.KPJavaSpringBootApplication;
import com.kpjavaspringboot.kpKafka.KPKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/KPKafkaMSGApp" })
public class KPKafkaController {

    private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);

    //@Autowired
    KPKafkaProducer   kpKafkaProducer;

    @RequestMapping(value = { "/sendMsg2KafkaProducer" }, method = RequestMethod.POST)
    public String sendMsg2KafkaProducer(@RequestParam("msg") String msg) {

        System.out.println("KP : KPJavaSpringBootApplication - @RestController : KPKafkaController - @PostMapping");
        //logger.info("KP : KPJavaSpringBootApplication - @RestController : KPKafkaController - @PostMapping");

        kpKafkaProducer.publish2Topic(msg);

        System.out.println("KP : KPJavaSpringBootApplication - Kafka Consumer : Message Consumed : " + msg);
        //logger.info("KP : KPJavaSpringBootApplication - Kafka Consumer : Message Consumed : " + msg);

        return "";

    }

}
