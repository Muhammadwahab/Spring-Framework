package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FileWritter implements LogWriter {
	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("write in file "+text);
		
	}

	
}
