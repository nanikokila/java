package com.app;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLTest {

	private static Logger log = Logger.getLogger(Employee.class);
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Layout layout = new SimpleLayout();
		Appender ap = new ConsoleAppender(layout);
		log.addAppender(ap);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		log.info("Configuration is created");
		
		SessionFactory factory = cfg.buildSessionFactory();
		log.info("SessionFactory is created");
		
		Session ses = factory.openSession();
		log.info("Session is opened");
		
		/*HQL query for complete entity*/
		/*
		Query qry = ses.createQuery("from Employee e");
		List l =qry.list();
		log.info("Total Number Of Records : "+l.size());
		Iterator itr = l.iterator();

		while(itr.hasNext())
		{
			Employee emp = (Employee)itr.next();
			log.info(emp.getEmpId());
			log.info(emp.getEmpName());
			log.info(emp.getEmpSal());
		}		*/

		
		/*HQL query for partial entity*/
		
		Query qry1 = ses.createQuery("select e.empName ,e.empSal from com.app.Employee e ");
		List l1 =qry1.list();
		log.info("Total Number Of Records : "+l1.size());
		Iterator it = l1.iterator();

		while(it.hasNext())
		{
			Object o[] = (Object[])it.next();

			log.info("Employee id : " +o[0]+ " Employee Name : "+o[1]);

		}			

	}

}
