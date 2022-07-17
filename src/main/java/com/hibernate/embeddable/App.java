package com.hibernate.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setCourse("Java");
		c1.setDuration("3 months");
		
		Student s1 = new Student();
		s1.setName("James Gosaling");
		s1.setCerti(c1);
		
		Certificate c2 = new Certificate();
		c2.setCourse("Spring");
		c2.setDuration("3 months");
		
		Student s2 = new Student();
		s2.setName("Rodd Jonsson");
		s2.setCerti(c2);
		
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/embeddable/hibernate.cfg.xml");
		SessionFactory factory =  cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
