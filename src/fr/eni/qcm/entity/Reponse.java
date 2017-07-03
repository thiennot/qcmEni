package fr.eni.qcm.entity;

/**
 * Entite Reponse
 * @author mvinet
 *
 */
public class Reponse {

	/**
	 * id de la réponse
	 */
	private int idReponse;
	
	/**
	 * nom de la réponse
	 */
	private String nomReponse;
	
	/**
	 * true si juste, sinon false
	 */
	private boolean correct;
	
	/**
	 * la question
	 */
	private Question question;

	/**
	 * @return the idReponse
	 */
	public int getIdReponse() {
		return idReponse;
	}

	/**
	 * @param idReponse the idReponse to set
	 */
	public void setIdReponse(int idReponse) {
		this.idReponse = idReponse;
	}

	/**
	 * @return the nomReponse
	 */
	public String getNomReponse() {
		return nomReponse;
	}

	/**
	 * @param nomReponse the nomReponse to set
	 */
	public void setNomReponse(String nomReponse) {
		this.nomReponse = nomReponse;
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
	
	
	
}
