package fr.eni.qcm.dto;

import java.util.ArrayList;
import java.util.List;


public class QuestionDTO {
	private int idQuestion;
	private String nomQuestion;
	private List<ReponseDTO> reponses;
	private String balise;
	
	public QuestionDTO(){
		reponses = new ArrayList();
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

	public List<ReponseDTO> getReponses() {
		return reponses;
	}

	public void setReponses(List<ReponseDTO> reponses) {
		this.reponses = reponses;
	}

	public String getBalise() {
		return balise;
	}

	public void setBalise(String balise) {
		this.balise = balise;
	}
	
	public void addReponse(ReponseDTO r){
		this.reponses.add(r);
	}
	
}
