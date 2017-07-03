package fr.eni.qcm.entity;

public class Section {

	private int idSection;
	
	private String nomSection;
	
	private int nombreQuestion;
	
	private Theme theme;

	/**
	 * @return the idSection
	 */
	public int getIdSection() {
		return idSection;
	}

	/**
	 * @param idSection the idSection to set
	 */
	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}

	/**
	 * @return the nomSection
	 */
	public String getNomSection() {
		return nomSection;
	}

	/**
	 * @param nomSection the nomSection to set
	 */
	public void setNomSection(String nomSection) {
		this.nomSection = nomSection;
	}

	/**
	 * @return the nombreQuestion
	 */
	public int getNombreQuestion() {
		return nombreQuestion;
	}

	/**
	 * @param nombreQuestion the nombreQuestion to set
	 */
	public void setNombreQuestion(int nombreQuestion) {
		this.nombreQuestion = nombreQuestion;
	}

	/**
	 * @return the theme
	 */
	public Theme getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	
	
}
