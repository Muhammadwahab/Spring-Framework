package com.example.demo;

public class Logger {
	
	FileWritter fileWritter;
	ConsoleWritter consoleWritter;
	public FileWritter getFileWritter() {
		return fileWritter;
	}
	public void setFileWritter(FileWritter fileWritter) {
		this.fileWritter = fileWritter;
	}
	public ConsoleWritter getConsoleWritter() {
		return consoleWritter;
	}
	public void setConsoleWritter(ConsoleWritter consoleWritter) {
		this.consoleWritter = consoleWritter;
	}
	@Override
	public String toString() {
		return "Logger [fileWritter=" + fileWritter + ", consoleWritter=" + consoleWritter + "]";
	}
	public void writeFile(String text)
	{
		System.out.println(text);
	}
	public void writeConsole(String text)
	{
		System.out.println(text);
	}
	
	

}
