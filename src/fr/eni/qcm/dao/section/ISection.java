package fr.eni.qcm.dao.section;

/**
 * Interface de la section
 * @author mvinet
 *
 */
public interface ISection {

	/**
	 * Retourne le nombre de question disponible dans une section
	 * @param idSection id de la section
	 * @return un nombre de question
	 */
	int getNombreQuestion(int idSection);
	
}
