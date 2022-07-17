package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Engineer e1 = new Engineer();
		Engineer e2 = new Engineer();

		e1.setEng_Id(43);
		e1.setName("Ram");

		e2.setEng_Id(14);
		e2.setName("Sham");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setProject_Id(76987);
		p1.setProject_name("Library managment system!!!");

		p2.setProject_Id(45363);
		p2.setProject_name("Chatbot");

		List<Engineer> list1 = new ArrayList<Engineer>();
		List<Project> list2 = new ArrayList<Project>();

		list1.add(e1);
		list1.add(e2);

		list2.add(p1);
		list2.add(p2);

		e1.setProjects(list2);
		p1.setEngineers(list1);

		Configuration cfg = new Configuration();
		cfg.configure("com/ManyToMany/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		Project p = session.get(Project.class, 76987);
		
		System.out.println(p.getProject_Id());
		System.out.println(p.getProject_name());
		
		for(Engineer e : p.getEngineers())
			System.out.println(e); 					//this gives us StackOverFlowException

		tx.commit();
		session.close();
		factory.close();

	}
}
