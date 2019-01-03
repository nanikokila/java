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
		
		Employee emp = (Employee)session.get(Employee.class, 5);
		System.out.println(emp);
	}

}
