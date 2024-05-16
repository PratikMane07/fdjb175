package com.cjc.springmvccrudapp.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.springmvccrudapp.daoi.StudentdaoI;
import com.cjc.springmvccrudapp.model.Student;

@Repository
public class StudentDaoImpl implements StudentdaoI {
	
	@Autowired
	SessionFactory sf;

	@Override
	public void saveData(Student s) {
		
		Session session = sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
		
		
		System.out.println("Data save to database");
	 
		
	}

	@Override
	public void loginStudent(String username, String password) {
		// TODO Auto-generated method stub
		
	}

}
