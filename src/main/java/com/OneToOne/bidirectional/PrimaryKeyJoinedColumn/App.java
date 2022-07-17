package com.OneToOne.bidirectional.PrimaryKeyJoinedColumn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Account acc1 = new Account();
		acc1.setAccount_number("123456789");

		Employee emp1 = new Employee();
		emp1.setEmail("abcd@gmail.com");
		emp1.setFirst_name("Santosh");
		emp1.setLast_name("Naik");

		acc1.setEmployee(emp1);
		emp1.setAccount(acc1);

		Employee emp2 = new Employee();
		emp2.setEmail("pqrs@gmail.com");
		emp2.setFirst_name("Sandip");
		emp2.setLast_name("Patil");

		Account acc2 = new Account();
		acc2.setAccount_number("987654321");

		emp2.setAccount(acc2);
		acc2.setEmployee(emp2);

		Configuration cfg = new Configuration();
		cfg.configure("com/OneToOne/bidirectional/PrimaryKeyJoinedColumn/hibernate.cfg.bi.pkjc.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		
		session.flush();
		tx.commit();
		session.close();
		factory.close();
	}
}
