package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ListApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans/beans.xml");
		Address address=(Address)context.getBean("address2");
		System.out.println(address);
		((ClassPathXmlApplicationContext)context).close();


	}
}
