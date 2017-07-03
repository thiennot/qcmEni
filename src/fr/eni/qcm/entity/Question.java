package fr.eni.qcm.entity;

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
	 * le theme
	 */
	private Theme theme;

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
	
	
	
}
