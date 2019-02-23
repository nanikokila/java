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
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Test {

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
		
		/*Creating Criteri query*/
		Criteria crit = ses.createCriteria(Employee.class);
		Criterion c1 = Restrictions.eq("empId", new Integer(1));
		crit.add(c1);
		crit.addOrder(Order.desc("empSal"));
		log.info("Order of salaries...");
		log.info("Criteria query is created using Restrictions class...");
		List list = crit.list();
		log.info("List total size:"+list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Employee emp = (Employee)itr.next();
			log.info(emp.getEmpId());
			log.info(emp.getEmpName());
			log.info(emp.getEmpSal());
		}
		ses.close();
		factory.close();
	}

}
