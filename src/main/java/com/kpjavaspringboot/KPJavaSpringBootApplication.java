package com.kpjavaspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KPJavaSpringBootApplication {

	private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);

	public static void main(String[] args) {

		////Spring Application Context
		//SpringApplication.run(KPJavaSpringBootApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(KPJavaSpringBootApplication.class, args);
		//System.out.println("KP : KPJavaSpringBootApplication - @ConfigurableApplicationContext & Bean : main()");
		logger.info("KP : KPJavaSpringBootApplication - @ConfigurableApplicationContext & Bean : main()");

		//Get and Set Session Variables Here
		//session.setAttribute(id, 1);
		//session.getParameter("sRDeviceIP");

		//KP : Interview Questions & Answers
		//KPJavaInterviewExamples.getInterviewQuestions();
		//KPJavaInterviewExamples objKPJavaIntvwExp = new KPJavaInterviewExamples();
		//objKPJavaIntvwExp.getInterviewQuestions();

		////KP : Master Card Interview Test

		////Context Bean - Dependency Injection (DI) :  DI City Component
		//City city = context.getBean(City.class);
		//city.display();
	}

}
   