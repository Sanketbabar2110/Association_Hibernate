package com.OneToMany.unidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	private int question_Id;
	private String question;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Answer> answers;

	public Question() {
		super();
	}

	public Question(int question_Id, String question, List<Answer> answers) {
		super();
		this.question_Id = question_Id;
		this.question = question;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [question_Id=" + question_Id + ", question=" + question + ", answers=" + answers + "]";
	}

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
