package fr.eni.qcm.entity;

import java.util.List;

/**
 * Entity Theme
 * @author mvinet
 *
 */
public class Theme {

	/**
	 * id du theme
	 */
	private int idTheme;
	
	/**
	 * le code du theme
	 */
	private String codeTheme;
	
	/**
	 * le libelle du theme
	 */
	private String libelleTheme;
	
	/**
	 * la description du theme
	 */
	private String descriptionTheme;

	/**
	 * les questions du theme
	 */
	private List<Question> questions;
	
	/**
	 * @return the idTheme
	 */
	public int getIdTheme() {
		return idTheme;
	}

	/**
	 * @param idTheme the idTheme to set
	 */
	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	/**
	 * @return the codeTheme
	 */
	public String getCodeTheme() {
		return codeTheme;
	}

	/**
	 * @param codeTheme the codeTheme to set
	 */
	public void setCodeTheme(String codeTheme) {
		this.codeTheme = codeTheme;
	}

	/**
	 * @return the libelleTheme
	 */
	public String getLibelleTheme() {
		return libelleTheme;
	}

	/**
	 * @param libelleTheme the libelleTheme to set
	 */
	public void setLibelleTheme(String libelleTheme) {
		this.libelleTheme = libelleTheme;
	}

	/**
	 * @return the descriptionTheme
	 */
	public String getDescriptionTheme() {
		return descriptionTheme;
	}

	/**
	 * @param descriptionTheme the descriptionTheme to set
	 */
	public void setDescriptionTheme(String descriptionTheme) {
		this.descriptionTheme = descriptionTheme;
	}

	/**
	 * @return the questions
	 */
	public List<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	
}
