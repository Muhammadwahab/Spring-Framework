package com.example.demo;

public class ConsoleWritter implements LogWriter {

	@Override
	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("console "+text);
		
	}

}
