package fr.eni.qcm.entity;

/**
 * Entite Proposition
 * @author mvinet
 *
 */
public class Proposition {

	/**
	 * identifiant de la proposition
	 */
	private int idProposition;
	
	/**
	 * la question
	 */
	private Question question;
	
	/**
	 * l'énnoncé
	 */
	private String ennonce;
	
	/**
	 * true si correct, sinon false
	 */
	private boolean correct;

	/**
	 * @return the idProposition
	 */
	public int getIdProposition() {
		return idProposition;
	}

	/**
	 * @param idProposition the idProposition to set
	 */
	public void setIdProposition(int idProposition) {
		this.idProposition = idProposition;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 * @return the correct
	 */
	public boolean isCorrect() {
		return correct;
	}

	/**
	 * @param correct the correct to set
	 */
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public String getEnnonce() {
		return ennonce;
	}

	public void setEnnonce(String ennonce) {
		this.ennonce = ennonce;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Proposition [idProposition=" + idProposition + ",ennonce=" + ennonce + ", correct=" + correct
				+ "]";
	}
	
	
	
}
