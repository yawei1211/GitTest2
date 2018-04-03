package org.test.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.test.bean.Student;
import org.test.services.StudentServices;

@Controller
@RequestMapping("/")
public class StudentAction {

	@Autowired
	private StudentServices studentServices;
	
	@RequestMapping("/findAllStudent")
	public String findAllStudent(HttpServletRequest request){
		         List<Student> listUser =studentServices.selectStudent();
		         request.setAttribute("listUser", listUser);
		         return "/allStudent";
		    }
}
