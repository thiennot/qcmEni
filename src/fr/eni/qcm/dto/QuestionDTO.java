package fr.eni.qcm.dto;

import java.util.ArrayList;
import java.util.List;


public class QuestionDTO {
	private int idQuestion;
	private String nomQuestion;
	private List<ReponseDTO> reponse;
	
	public QuestionDTO(){
		reponse = new ArrayList();
	}

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getNomQuestion() {
		return nomQuestion;
	}

	public void setNomQuestion(String nomQuestion) {
		this.nomQuestion = nomQuestion;
	}

	public List<ReponseDTO> getReponse() {
		return this.reponse;
	}

	public void setReponse(List<ReponseDTO> reponse) {
		this.reponse = reponse;
	}
	public void addReponse(ReponseDTO r){
		this.reponse.add(r);
	}
	
}
