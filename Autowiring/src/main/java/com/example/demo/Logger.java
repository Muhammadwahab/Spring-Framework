package com.example.demo;

public class Logger {
	
	LogWriter fileWritter;
	LogWriter consoleWritter;
	
	
	public Logger() {
	
	}
	public Logger(FileWritter fileWritter, ConsoleWritter consoleWritter) {
		this.fileWritter = fileWritter;
		this.consoleWritter = consoleWritter;
	}
	public LogWriter getFileWritter() {
		return fileWritter;
	}
	public void setFileWritter(LogWriter fileWritter) {
		this.fileWritter = fileWritter;
	}
	public LogWriter getConsoleWritter() {
		return consoleWritter;
	}
	public void setConsoleWritter(LogWriter consoleWritter) {
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
		consoleWritter.write(text);
	}
	
	

}
