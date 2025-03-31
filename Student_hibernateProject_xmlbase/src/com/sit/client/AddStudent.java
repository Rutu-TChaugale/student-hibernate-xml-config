package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.model.Student;

public class AddStudent {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		Configuration configure = cfg.configure("hibernate.cfg.xml");
		System.out.println("hiii");
		
		 SessionFactory sessionFactory = configure.buildSessionFactory(); 
		 Session session = sessionFactory.openSession();
		
		 
		 Student stu= new Student(); 
		 stu.setId(102); 
		 stu.setName("Gayatri");
		 stu.setEmail("gayu@gmail.com"); 
		 stu.setAddress("kolhapur2");
		 
		 session.save(stu); 
		 session.beginTransaction().commit();
		 
		}

}
