package com.topica.dao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.topica.model.Student;

public class StudentParallel implements StudentDao{

	@Override
	public Map<Integer, List<Student>> getGroupStudentByGender(List<Student> students) {
		return students.parallelStream()
                .collect(Collectors.groupingBy(Student::getGender));
	}

	@Override
	public int getSumSkillPoin(List<Student> students, int minSkillPoin) {
		return students.parallelStream()
                .map(Student::getSkillPoint).filter(skill -> skill >= minSkillPoin)
                .collect(Collectors.summingInt(Integer::intValue));
	}

	@Override
	public long getCountSkillPoin(List<Student> students, int minSkillPoin) {
		return students.parallelStream()
                .filter(skill -> skill.getSkillPoint() >= minSkillPoin)
                .count();
	}

	@Override
	public Map<Integer, Student> getStudent(List<Student> students, int minSkillPoin) {
		return students.parallelStream().filter(student-> student.getSkillPoint() >= minSkillPoin)
			      .collect(Collectors.toMap(Student::getId, student -> student));
	}

}
