package com.OneToOne.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
 
	public static void main(String[] args) {
		
		Answer a1 = new Answer();
		a1.setAns_Id(35);
		a1.setAnswer("IDE for writing code!!!");

		Question q1 = new Question();
		q1.setQue_ID(40);
		q1.setQuestion("how to do with eclipse?");
		q1.setAnswer(a1);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/OneToOne/unidirectional/hibernate.cfg.uni.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		
		tx.commit();
		session.close();
		factory.close();		
	}
}
