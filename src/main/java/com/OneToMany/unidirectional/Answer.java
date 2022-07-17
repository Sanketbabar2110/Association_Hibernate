package com.OneToMany.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	private int answer_Id;
	private String answer;

	public Answer() {
		super();
	}

	public Answer(int answer_Id, String answer) {
		super();
		this.answer_Id = answer_Id;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answer_Id=" + answer_Id + ", answer=" + answer + "]";
	}

	public int getAnswer_Id() {
		return answer_Id;
	}

	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
