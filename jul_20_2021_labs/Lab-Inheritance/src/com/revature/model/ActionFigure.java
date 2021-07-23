package com.revature.model;

public class ActionFigure extends Doll {
	
	private String skill;
	//constructors
	public ActionFigure() {
		this.skill = "Spells";
		this.name = "Merlin";
		this.eyeColor = "green";
	}
	
	public ActionFigure(String name, String eyeColor, String skill) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.skill = skill;
	}
	//getter method
	public String getSkill() {
		return this.skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void useSkills() {
		System.out.println("Ka Pow! Im using my skill " + this.skill);
	}

}
