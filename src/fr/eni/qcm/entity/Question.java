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
	 * id du question
	 */
	private int idQuestion;
	
	/**
	 * �nonc� de la question
	 */
	private String enonce;
	
	/**
	 * url du m�dia
	 */
	private String media;
	
	/**
	 * le poids de la question
	 */
	private int poids;
	
	/**
	 * le type de question, simple ou multiple
	 */
	private String type;
	
	/**
	 * liste de proposition
	 */
	private List<Proposition> propositions;

	public Question() {
		this.propositions = new ArrayList<Proposition>();
	}
	
	/**
	 * @return the idQuestion
	 */
	public int getIdQuestion() {
		return idQuestion;
	}

	/**
	 * @param idQuestion the idQuestion to set
	 */
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	/**
	 * @return the enonce
	 */
	public String getEnonce() {
		return enonce;
	}

	/**
	 * @param enonce the enonce to set
	 */
	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	/**
	 * @return the media
	 */
	public String getMedia() {
		return media;
	}

	/**
	 * @param media the media to set
	 */
	public void setMedia(String media) {
		this.media = media;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the propositions
	 */
	public List<Proposition> getPropositions() {
		return propositions;
	}

	/**
	 * @param propositions the propositions to set
	 */
	public void setPropositions(List<Proposition> propositions) {
		this.propositions = propositions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", enonce=" + enonce
				+ ", media=" + media + ", poids=" + poids + ", type=" + type
				+ ", propositions=" + propositions + "]";
	}
	
}
