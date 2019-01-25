package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session  = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee  emp = new Employee();
		emp.setEmpId(9);
		emp.setEmpName("Reddy");
		emp.setEmpSal(7.0);
		session.save(emp);
		//session.update(emp);
		tx.commit();
		System.out.println("Updated successfully...");
        session.close();
	}

}
