package org.test.services;

import java.util.List;

import org.test.bean.Student;

public interface StudentServices {

	public List<Student> selectStudent();
	
	public boolean addStudent(Student student);
}
