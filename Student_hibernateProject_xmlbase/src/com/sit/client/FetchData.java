package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.model.Student;

public class FetchData {
	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("get method");
		 Student stu= session.get(Student.class, 101);
		 System.out.println(stu.getId()); System.out.println(stu.getName());
		 System.out.println(stu.getEmail()); System.out.println(stu.getAddress());
		 System.out.println("-------------------");
		 
		 System.out.println("load method");
		Student stu1= session.load(Student.class, 102);
		System.out.println(stu1.getId());
		System.out.println(stu1.getName());
		System.out.println(stu1.getEmail());
		System.out.println(stu1.getAddress());
		System.out.println("-------------------");
		
		
		
	}

}
