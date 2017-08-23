package com.example.demo;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ListApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans/beans.xml");
		OffersDAO dao=(OffersDAO)context.getBean("DAO");
		
		List<Offer> offers=dao.getOffers();
		
		for (Offer offer : offers) {
			
			System.out.println(offer);
			
		}
		
		
		
		
		//System.out.println(logger);
		((ClassPathXmlApplicationContext)context).close();


	}
}
