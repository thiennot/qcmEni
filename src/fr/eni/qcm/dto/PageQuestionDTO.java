package fr.eni.qcm.dto;

import java.util.ArrayList;
import java.util.List;

public class PageQuestionDTO {
	int chrono;
	List<QuestionDTO> lesQuestions;
	
	public PageQuestionDTO() {
		lesQuestions = new ArrayList();
	}

	public int getChrono() {
		return chrono;
	}

	public void setChrono(int chrono) {
		this.chrono = chrono;
	}

	public List<QuestionDTO> getLesQuestions() {
		return lesQuestions;
	}

	public void setLesQuestions(List<QuestionDTO> lesQuestions) {
		this.lesQuestions = lesQuestions;
	}
	
	public void addQuestion(QuestionDTO q) {
		this.lesQuestions.add(q);
	}
	
}
