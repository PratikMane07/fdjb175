package com.cjc.springmvccrudapp.servicei;

import com.cjc.springmvccrudapp.model.Student;

public interface StudentServiceI {

	public void saveStudent(Student s);

	public void loginStudent(String username, String password);
	
	

}
