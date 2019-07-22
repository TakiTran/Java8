package com.topica.app;

import java.util.ArrayList;
import java.util.List;

import com.topica.dao.StudentDaoImpl;
import com.topica.model.Student;

public class App {

	public static void main(String []args) {
		// gender: 1 -> male, 2 -> female
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Dao", 1, DateTime.getRandomDate()));
		students.add(new Student(2, "Dung", 2, DateTime.getRandomDate()));
		students.add(new Student(3, "Duc", 1, DateTime.getRandomDate()));
		students.add(new Student(4, "Tuan", 2, DateTime.getRandomDate()));
		
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		
		System.out.println(studentDaoImpl.getGroupStudentByGender(students));
		
		System.out.println(studentDaoImpl.getCountSkillPoin(students, 5));
		
		System.out.println(studentDaoImpl.getSumSkillPoin(students, 5));
		
		System.out.println(studentDaoImpl.getStudent(students, 5));
		
	}
	
}
