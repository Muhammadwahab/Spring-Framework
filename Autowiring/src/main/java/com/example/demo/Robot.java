package com.example.demo;

public class Robot {
	
	
	private String id="defualt id";
	private String speach="Default say hello";
	
	public void speek()
	{
		System.out.println(id+" "+speach);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpeach() {
		return speach;
	}
	public void setSpeach(String speach) {
		this.speach = speach;
	}
	
	

}
