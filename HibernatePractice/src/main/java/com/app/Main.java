package com.app;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	private static Logger log = Logger.getLogger(Employee.class);
	
	public static void main(String[] args) {

		Layout layout = new SimpleLayout();
		Appender ap = new  ConsoleAppender(layout);
		log.addAppender(ap);
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session  = factory.openSession();
		Employee  emp = new Employee();
		emp.setEmpId(7);
		emp.setEmpName("Ramya");
		emp.setEmpSal(20000.0);
		Transaction tx = session.beginTransaction();
		log.info("The object is saved successfully...");
		session.save(emp);
		tx.commit();
		session.clear();
		
	
		
		/*
		 * If no row present in database it returns null in get()
		 */
		
		
		/*Employee emp = (Employee)session.get(Employee.class, 5);
		System.out.println(emp);*/
		
		
		/*
		 * if no row present in database it returns objectNotFoundException
		 */
		
		/*Employee emp = (Employee)session.load(Employee.class, 5);
		log.info("the object is loaded from db successfully...");
		System.out.println(emp);
		*/
	}

}
