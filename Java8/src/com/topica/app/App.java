package com.topica.app;

import java.util.ArrayList;
import java.util.List;

import com.topica.dao.StudentDaoImpl;
import com.topica.dao.StudentParallel;
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
		StudentParallel studentParallel = new StudentParallel();
		
		long startTime1 = System.currentTimeMillis();
		System.out.println(studentDaoImpl.getGroupStudentByGender(students));
		long time1 = System.currentTimeMillis() - startTime1;
		
		long startTime2 = System.currentTimeMillis();
		System.out.println(studentParallel.getGroupStudentByGender(students));
		long time2 = System.currentTimeMillis() - startTime2;
		
		System.out.println("Time: " + time1);
		System.out.println("TimeCurent: " + time2);
		
		System.out.println(studentDaoImpl.getCountSkillPoin(students, 5));
		
		System.out.println(studentDaoImpl.getSumSkillPoin(students, 5));
		
		System.out.println(studentDaoImpl.getStudent(students, 5));
		
	}
	
}
