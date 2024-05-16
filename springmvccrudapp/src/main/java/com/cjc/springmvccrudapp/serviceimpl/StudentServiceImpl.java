package com.cjc.springmvccrudapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springmvccrudapp.daoi.StudentdaoI;
import com.cjc.springmvccrudapp.model.Student;
import com.cjc.springmvccrudapp.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired
	StudentdaoI sdi;

	@Override
	public void saveStudent(Student s) {
		
		sdi.saveData(s);
		
	}

	@Override
	public void loginStudent(String username, String password) {
		sdi.loginStudent(username, password);
		
	}

}
