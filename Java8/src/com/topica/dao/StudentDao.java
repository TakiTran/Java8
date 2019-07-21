package com.topica.dao;
import java.util.List;
import java.util.Map;

import com.topica.model.*;

public interface StudentDao {
	public Map<Integer, List<Student>> getGroupStudentByGender(List<Student> students);
	public int getSumSkillPoin(List<Student> students, int minskillpoin);
	public long getCountSkillPoin(List<Student> students, int minskillpoin);
}
