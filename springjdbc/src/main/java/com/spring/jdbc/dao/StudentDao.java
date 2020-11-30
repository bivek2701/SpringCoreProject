package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
    
	public int change(Student student);
	
	public Student getStudent(int studentId);
}
