package fr.eni.qcm.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Entite Test
 * @author mvinet
 *
 */
public class Test {
	
	/**
	 * identifiant du test
	 */
	private int idTest;
	
	/**
	 * Libelle
	 */
	private String libelle;
	
	/**
	 * Description
	 */
	private String description;
	
	/**
	 * durée du test
	 */
	private int duree;
	
	/**
	 * seuil d'acceptation haut
	 */
	private int seuilHaut;
	
	/**
	 * seuil d'acceptation bas
	 */
	private int seuilBas;
	
	/**
	 * Liste de section du test
	 */
	private List<Section> sections;

	public Test() {
		this.sections = new ArrayList<Section>();
	}
	
	/**
	 * @return the idTest
	 */
	public int getIdTest() {
		return idTest;
	}

	/**
	 * @param idTest the idTest to set
	 */
	public void setIdTest(int idTest) {
		this.idTest = idTest;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}

	/**
	 * @return the seuilHaut
	 */
	public int getSeuilHaut() {
		return seuilHaut;
	}

	/**
	 * @param seuilHaut the seuilHaut to set
	 */
	public void setSeuilHaut(int seuilHaut) {
		this.seuilHaut = seuilHaut;
	}

	/**
	 * @return the seuilBas
	 */
	public int getSeuilBas() {
		return seuilBas;
	}

	/**
	 * @param seuilBas the seuilBas to set
	 */
	public void setSeuilBas(int seuilBas) {
		this.seuilBas = seuilBas;
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
	
	
}
