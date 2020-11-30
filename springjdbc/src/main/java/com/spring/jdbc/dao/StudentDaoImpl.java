package com.spring.jdbc.dao;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		
  //Insert Query....   
   String query="insert into student(id,name,city) values(?,?,?)";
	int res = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	
		return res;
	}
	public int change(Student student) {
		// Updating student
		String query="update student set name=?,city=? where id=?";
		int res = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}
	
	public Student getStudent(int studentId) {
		// Selecting single student
		String query="select * from student where id=?";
		RowMapper <Student> rowMapper = new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
