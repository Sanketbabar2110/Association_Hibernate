package com.OneToOne.unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@Column(name = "Answer_Id")
	private int ans_Id;
	private String answer;
	
	public Answer() {
		super();
	}
	
	public Answer(int ans_Id, String answer) {
		super();
		this.ans_Id = ans_Id;
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Answer [ans_Id=" + ans_Id + ", answer=" + answer + "]";
	}
	
	public int getAns_Id() {
		return ans_Id;
	}
	public void setAns_Id(int ans_Id) {
		this.ans_Id = ans_Id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
