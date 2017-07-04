package fr.eni.qcm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity Question
 * @author mvinet
 *
 */
public class Question {

	/**
	 * id question
	 */
	private int idQuestion;
	
	/**
	 * nom question
	 */
	private String nomQuestion;
	
	/**
	 * Liste des réponses disponible
	 */
	private List<Reponse> reponse;
	
	/**
	 * le theme
	 */
	private Theme theme;

	public Question() {
		this.reponse = new ArrayList<Reponse>();
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

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	/**
	 * @return the reponse
	 */
	public List<Reponse> getReponse() {
		return reponse;
	}

	/**
	 * @param reponse the reponse to set
	 */
	public void setReponse(List<Reponse> reponse) {
		this.reponse = reponse;
	}
	
	
	
}
