package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ListApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans/beans.xml");
		Logger logger=(Logger)context.getBean("logger");
		logger.writeConsole("Hi dear in Console");
		logger.writeFile("Hi dear in File ");
		System.out.println(logger);
		((ClassPathXmlApplicationContext)context).close();


	}
}
