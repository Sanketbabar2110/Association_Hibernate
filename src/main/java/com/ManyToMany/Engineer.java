package com.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Engineer {

	@Id
	private int eng_Id;
	private String name;

	@ManyToMany
	private List<Project> projects;

	public Engineer() {
		super();
	}

	public Engineer(int eng_Id, String name, List<Project> projects) {
		super();
		this.eng_Id = eng_Id;
		this.name = name;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Engineer [eng_Id=" + eng_Id + ", name=" + name + ", projects=" + projects + "]";
	}

	public int getEng_Id() {
		return eng_Id;
	}

	public void setEng_Id(int eng_Id) {
		this.eng_Id = eng_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
