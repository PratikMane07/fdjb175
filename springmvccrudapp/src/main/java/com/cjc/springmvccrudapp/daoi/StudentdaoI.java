package com.cjc.springmvccrudapp.daoi;

import com.cjc.springmvccrudapp.model.Student;

public interface StudentdaoI {

	public void saveData(Student s);

	public void loginStudent(String username, String password);     

}
