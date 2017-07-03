package fr.eni.qcm.entity;

import java.util.Date;

/**
 * Entite QCM
 * @author mvinet
 *
 */
public class QCM {

	/**
	 * Id de la section
	 */
	private int idSection;
	
	/**
	 * Id du QCM
	 */
	private int idQcm;
	
	/**
	 * Nom du QCM
	 */
	private String nomQcm;
	
	/**
	 * Temps du QCM
	 */
	private double tempsQCM;
	
	/**
	 * Nombre de question du QCM
	 */
	private int nombreQuestion;
	
	/**
	 * Date du QCM
	 */
	private Date dateQcm;

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
	 * @return the idQcm
	 */
	public int getIdQcm() {
		return idQcm;
	}

	/**
	 * @param idQcm the idQcm to set
	 */
	public void setIdQcm(int idQcm) {
		this.idQcm = idQcm;
	}

	/**
	 * @return the nomQcm
	 */
	public String getNomQcm() {
		return nomQcm;
	}

	/**
	 * @param nomQcm the nomQcm to set
	 */
	public void setNomQcm(String nomQcm) {
		this.nomQcm = nomQcm;
	}

	/**
	 * @return the tempsQCM
	 */
	public double getTempsQCM() {
		return tempsQCM;
	}

	/**
	 * @param tempsQCM the tempsQCM to set
	 */
	public void setTempsQCM(double tempsQCM) {
		this.tempsQCM = tempsQCM;
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
	 * @return the dateQcm
	 */
	public Date getDateQcm() {
		return dateQcm;
	}

	/**
	 * @param dateQcm the dateQcm to set
	 */
	public void setDateQcm(Date dateQcm) {
		this.dateQcm = dateQcm;
	}
	
	
	
}
