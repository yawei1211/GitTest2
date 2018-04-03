package org.test.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.bean.Student;
import org.test.mapper.UserMapper;
import org.test.services.StudentServices;
@Service
@Transactional
public class StudentServicesImpl implements StudentServices{

	@Resource
	public UserMapper usermapper;
	@Override
	public List<Student> selectStudent() {
		List<Student> selectStudent=usermapper.selectStudent();
		
		return selectStudent;
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
