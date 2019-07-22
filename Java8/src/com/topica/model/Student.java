package com.topica.model;

import java.time.LocalDate;
import java.util.Random;

public class Student {
	private int id;
	private String name;
	private int gender; 
	private LocalDate birthOfDate;
	private int skillPoint;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Student(int id, String name, int gender, LocalDate birthOfDate) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthOfDate = birthOfDate;
		this.skillPoint = new Random().nextInt(100);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", birthOfDate=" + birthOfDate
				+ ", skillPoint=" + skillPoint + "]";
	}
	
	
	
}
