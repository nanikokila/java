package org.sathya;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Query qry= session.createQuery("select v.vendorName, c.customerName from Vendor v Left Join v.children c");

		List l = qry.list();
		Iterator it=l.iterator();

		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			System.out.println(rows[0]+ " -- " +rows[1]);
		}
	}

}
