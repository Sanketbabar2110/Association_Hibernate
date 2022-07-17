package com.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int project_Id;
	private String project_name;

	@ManyToMany
	private List<Engineer> engineers;

	public Project() {
		super();
	}

	public Project(int project_Id, String project_name, List<Engineer> engineers) {
		super();
		this.project_Id = project_Id;
		this.project_name = project_name;
		this.engineers = engineers;
	}

	@Override
	public String toString() {
		return "Project [project_Id=" + project_Id + ", project_name=" + project_name + ", engineers=" + engineers
				+ "]";
	}

	public int getProject_Id() {
		return project_Id;
	}

	public void setProject_Id(int project_Id) {
		this.project_Id = project_Id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Engineer> getEngineers() {
		return engineers;
	}

	public void setEngineers(List<Engineer> engineers) {
		this.engineers = engineers;
	}
}
