package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ListApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Robot robot=(Robot)context.getBean("robot");
		robot.speek();
		
		//System.out.println(logger);
		((ClassPathXmlApplicationContext)context).close();


	}
}
