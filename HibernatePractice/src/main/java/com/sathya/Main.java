package com.sathya;

import java.util.Date;

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

	private static Logger log = Logger.getLogger(Emp.class);
	public static void main(String[] args) {

		Layout layout = new SimpleLayout();
		Appender ap = new  ConsoleAppender(layout);
		log.addAppender(ap);
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session  = factory.openSession();
		
		Person p = new Person();
	     p.setFirstname("Ashok");
	     p.setLastname("Reddy");
	     
	     Emp emp  = new Emp();
	     emp.setDepartmentName("CSE");
	     emp.setDepartmentName("Naveen");
	     emp.setLastname("Reddy");
	     emp.setJoiningDate(new Date());
	     
	     Transaction tx = session.beginTransaction();
	     session.save(p);
	     session.save(emp);
	     tx.commit();
	     session.close();
	     
	}

}
