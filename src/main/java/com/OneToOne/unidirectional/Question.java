package com.OneToOne.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name = "Question_Id")
	private int que_ID;
	private String Question;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Answer answer;
	
	public Question() {
		super();
	}
	
	public Question(int que_ID, String question, Answer answer) {
		super();
		this.que_ID = que_ID;
		Question = question;
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Question [que_ID=" + que_ID + ", Question=" + Question + ", answer=" + answer + "]";
	}
	
	public int getQue_ID() {
		return que_ID;
	}
	public void setQue_ID(int que_ID) {
		this.que_ID = que_ID;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
}
