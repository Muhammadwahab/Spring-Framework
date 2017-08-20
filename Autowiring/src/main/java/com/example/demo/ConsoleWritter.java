package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWritter implements LogWriter {

	@Override
	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("console "+text);
		
	}

}
