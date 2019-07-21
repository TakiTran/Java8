package com.topica.model;

import java.time.LocalDate;
import java.util.Random;

public class Student {
	private String name;
	private int gender; 
	private LocalDate birthOfDate;
	private int skillPoint;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	public int getSkillPoint() {
		return skillPoint;
	}
	public void setSkillPoint(int skillPoint) {
		this.skillPoint = skillPoint;
	}
	public Student(String name, int gender, LocalDate birthOfDate) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthOfDate = birthOfDate;
		this.skillPoint = new Random().nextInt(100);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", birthOfDate=" + birthOfDate + ", skillPoint=" + skillPoint
				+ "]";
	}
	
	
}
