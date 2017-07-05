package fr.eni.qcm.dto;

import java.util.ArrayList;
import java.util.List;


public class QuestionDTO {
	private int idQuestion;
	private String nomQuestion;
	private List<PropositionDTO> propositions;
	private String balise;
	
	public QuestionDTO(){
		propositions = new ArrayList();
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

	public List<PropositionDTO> getPropositions() {
		return propositions;
	}

	public void setPropositions(List<PropositionDTO> reponses) {
		this.propositions = reponses;
	}

	
	public void addProposition(PropositionDTO r){
		this.propositions.add(r);
	}

	public String getBalise() {
		return balise;
	}

	public void setBalise(String balise) {
		if("simple".equals(balise)){
			this.balise="radio";
		}else{
			this.balise = "checkbox";
		}
		
	}
	
	
	
	
}
