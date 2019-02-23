package com.app;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class ProjectionsTest {

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
		
		/*Creating Projections query*/
		
		Criteria crit = ses.createCriteria(Employee.class);
		crit.setProjection(Projections.property("empId"));
		log.info("Criteria query is created using Projections class..");
		List list = crit.list();
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Integer emp = (Integer)itr.next();
			log.info(emp);
		}
		ses.close();
		factory.close();
	}

}
