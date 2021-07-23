package com.revature.model;

public class Doll extends Toy {
	String eyeColor;
	//constructors
	public Doll() {
		this.eyeColor = "brown";
		this.name = "buddy";
	
	}
	
	public Doll(String name, String eyeColor) {
		super(name);
		this.eyeColor = eyeColor;
	}
	//getter method
	public String getEyeColor() {
		
		return this.eyeColor;
	}
	//setter method
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	//talk method
	public void makeTalk() {
		
		System.out.println("Hi everyone! Im a doll");
	}
	
	

}
