package com.OneToMany.unidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Question q = new Question();
		q.setQuestion_Id(1010);
		q.setQuestion("What is java?");
		
		Answer ans1 = new Answer(); 
		ans1.setAnswer_Id(23);
		ans1.setAnswer("Java is a programming language!!!");
		
		Answer ans2 = new Answer(); 
		ans2.setAnswer_Id(887);
		ans2.setAnswer("It is a platform to develop the application!!!");
		
		Answer ans3 = new Answer(); 
		ans3.setAnswer_Id(345);
		ans3.setAnswer("It provides the environment to run the application!!!");
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		q.setAnswers(list);
		
		Configuration cfg = new Configuration();
		cfg.configure("com/OneToMany/unidirectional/hibernate.cfg.uni.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q);
		session.save(ans3);
		session.save(ans2);
		session.save(ans1);
		
		Question que = session.get(Question.class, 1010);
		
		System.out.println(que.getQuestion_Id());
		System.out.println(que.getQuestion());
		
		for(Answer ans : que.getAnswers())
			System.out.println(ans);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
