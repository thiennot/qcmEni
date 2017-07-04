package fr.eni.qcm.entity;

/**
 * Entite Section
 * @author mvinet
 *
 */
public class Section {

	/**
	 * le test de la section
	 */
	private Test test;
	
	/**
	 * nombre de question a récupéré pour le test
	 */
	private int nbQuestion;
	
	/**
	 * le theme de la section
	 */
	private Theme theme;

	/**
	 * @return the test
	 */
	public Test getTest() {
		return test;
	}

	/**
	 * @param test the test to set
	 */
	public void setTest(Test test) {
		this.test = test;
	}

	/**
	 * @return the nbQuestion
	 */
	public int getNbQuestion() {
		return nbQuestion;
	}

	/**
	 * @param nbQuestion the nbQuestion to set
	 */
	public void setNbQuestion(int nbQuestion) {
		this.nbQuestion = nbQuestion;
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
