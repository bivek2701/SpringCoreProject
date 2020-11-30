package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started......." );
        
        //Spring Jdbc->template
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        
        /*
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //Insert Query....
        
        String query="insert into student(id,name,city) values(?,?,?)";
        
        //Fire query....
        
        int result = template.update(query,101,"Aarti Jha", "Bihar");
        
        System.out.println("No of record inserted...." +result);
        */
        
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
//        Student student= new Student();
//        student.setId(555);
//        student.setName("Vartika Jha");
//        student.setCity("Chandigarh");
//        
//        int result = studentDao.insert(student);
        
    
        //Updating the student
        
//        Student student=new Student();
//        student.setId(555);
//        student.setName("jigyasa");
//        student.setCity("Madhubani");
//        int result = studentDao.change(student);
//        System.out.println("Student Updated: " +result);
        
        
        Student student = studentDao.getStudent(101);
        System.out.println(student);
    }
}
