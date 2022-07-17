package com.hibernate.embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int sid;
	private String name;
	private Certificate certi;
	
	public Student() {
		super();
	}
	
	public Student(int sid, String name, Certificate certi) {
		super();
		this.sid = sid;
		this.name = name;
		this.certi = certi;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", certi=" + certi + "]";
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
}
