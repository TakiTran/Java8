package com.topica.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.topica.model.Student;

public class App {

	public static void main(String []args) {
		// gender: 1 -> male, 2 -> female
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Dao", 1, DateTime.getRandomDate()));
		students.add(new Student("Dung", 2, DateTime.getRandomDate()));
		students.add(new Student("Duc", 1, DateTime.getRandomDate()));
		students.add(new Student("Tuan", 2, DateTime.getRandomDate()));
	}
}
