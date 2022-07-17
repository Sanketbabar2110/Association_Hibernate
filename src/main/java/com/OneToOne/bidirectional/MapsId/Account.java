package com.OneToOne.bidirectional.MapsId;

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

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [account_Id=" + account_Id + ", account_number=" + account_number + "]";
	}
	
	public Account(int account_Id, String account_number) {
		super();
		this.account_Id = account_Id;
		this.account_number = account_number;
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
}
