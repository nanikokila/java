package com.sathyatech;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sathya.Emp;

public class ForOurLogic {

	private static Logger log = Logger.getLogger(Emp.class);
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Layout layout = new SimpleLayout();
		Appender ap = new  ConsoleAppender(layout);
		log.addAppender(ap);

		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session  = factory.openSession();


		VendorParent vp = new VendorParent();
		vp.setVendorId(7);
		vp.setVendorName("Akhila");

		Customer c = new Customer();
		c.setCustomerId(14);
		c.setCustomerName("Kokila");


		Set s=new HashSet();
		s.add(c);
		
		vp.setChildren(s);

		Transaction tx=session.beginTransaction();
		session.save(vp);
		tx.commit();
	}

}
