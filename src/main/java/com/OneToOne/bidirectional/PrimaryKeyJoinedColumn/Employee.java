package com.OneToOne.bidirectional.PrimaryKeyJoinedColumn;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	private String email;
	private String first_name;
	private String last_name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="accId_fk", referencedColumnName="account_Id")
	private Account account;

	public Employee() {
		super();
	}

	public Employee(int empId, String email, String first_name, String last_name, Account account) {
		super();
		this.empId = empId;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", first_name=" + first_name + ", last_name="
				+ last_name + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
