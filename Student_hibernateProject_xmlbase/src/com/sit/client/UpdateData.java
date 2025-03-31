package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.model.Student;

public class UpdateData {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student stu=session.get(Student.class, 101);
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getEmail());
		System.out.println(stu.getAddress());
		
		System.out.println("--update data now--");
		
		
		stu.setName("Vishal");
		stu.setEmail("vishu@gmail.com");
		stu.setAddress("Pune2");
		
		session.update(stu);
		tx.commit();
		
	}

}
