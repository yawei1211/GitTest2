package org.test.mapper;

import java.util.List;

import org.test.bean.Student;

public interface UserMapper {

    public List<Student> selectStudent();
	
	public boolean addStudent(Student student);
}
