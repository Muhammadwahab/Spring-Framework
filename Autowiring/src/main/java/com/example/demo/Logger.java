package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
  //	@Autowired
	FileWritter fileWritter;
	//@Autowired
	ConsoleWritter consoleWritter;
	
	
	public Logger() {
	
	}
	//@Autowired
	public Logger(FileWritter fileWritter, ConsoleWritter consoleWritter) {
		this.fileWritter = fileWritter;
		this.consoleWritter = consoleWritter;
	}
	public LogWriter getFileWritter() {
		return fileWritter;
	}
	@Autowired
	public void setFileWritter(FileWritter fileWritter) {
		this.fileWritter = fileWritter;
	}
	public LogWriter getConsoleWritter() {
		return consoleWritter;
	}
	@Autowired(required=false)
	public void setConsoleWritter(ConsoleWritter consoleWritter) {
		this.consoleWritter = consoleWritter;
	}
	@Override
	public String toString() {
		return "Logger [fileWritter=" + fileWritter + ", consoleWritter=" + consoleWritter + "]";
	}
	public void writeFile(String text)
	{
	fileWritter.write(text);
	}
	public void writeConsole(String text)
	{
		if(consoleWritter!=null)
		consoleWritter.write(text);
	}
	
	@PostConstruct
	public void init ()
	{
		System.out.println("init method called");
		
	}
	@PreDestroy
	public void Destroy ()
	{
		System.out.println("Destroy method called");
		
	}
	

}
