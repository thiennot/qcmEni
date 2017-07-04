package fr.eni.qcm.dao.section;

import fr.eni.qcm.entity.Section;

/**
 * Interface de la section
 * @author mvinet
 *
 */
public interface ISection {

	/**
	 * Retourne la section grâce a son identifiant
	 * @param idSection l'identifiant de la section
	 * @return l'objet section
	 */
	Section getSection(int idSection);
}
