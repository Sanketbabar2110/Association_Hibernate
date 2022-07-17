package com.OneToOne.bidirectional.JoinedColumn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int account_Id;
	private String account_number;
	
	@OneToOne(mappedBy="account")
	private Employee employee;
	
	public Account() {
		super();
	}
	
	public Account(int account_Id, String account_number, Employee employee) {
		super();
		this.account_Id = account_Id;
		this.account_number = account_number;
		this.employee = employee;
	}
	
	@Override
	public String toString() {
		return "Account [account_Id=" + account_Id + ", account_number=" + account_number + ", employee=" + employee
				+ "]";
	}
	
	public int getAccount_Id() {
		return account_Id;
	}
	public void setAccount_Id(int account_Id) {
		this.account_Id = account_Id;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
