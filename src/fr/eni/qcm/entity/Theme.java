package fr.eni.qcm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity Theme
 * @author mvinet
 *
 */
public class Theme {

	/**
	 * identifiant du theme
	 */
	private int idTheme;
	
	/**
	 * liste de section
	 */
	private List<Section> sections;
	
	/**
	 * le libelle du theme
	 */
	private String libelle;
	
	/**
	 * liste de question du theme
	 */
	private List<Question> questions;

	public Theme() {
		this.sections = new ArrayList<Section>();
		this.questions = new ArrayList<Question>();
	}
	
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
	 * @return the sections
	 */
	public List<Section> getSections() {
		return sections;
	}

	/**
	 * @param sections the sections to set
	 */
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
