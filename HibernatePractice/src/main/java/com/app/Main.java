package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session  = factory.openSession();
		/*Transaction tx = session.beginTransaction();
		Employee  emp = new Employee();*/
		
		/*
		 * If no row present in database it returns null in get()
		 */
		
		/*
		Employee emp = (Employee)session.get(Employee.class, 5);
		System.out.println(emp);*/
		
		
		/*
		 * if no row present in database it returns objectNotFoundException
		 */
		
		Employee emp = (Employee)session.load(Employee.class, 1);
		System.out.println(emp);
		
	}

}
