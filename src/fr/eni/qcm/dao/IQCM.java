package fr.eni.qcm.dao;

import java.util.List;

import fr.eni.qcm.entity.QCM;

/**
 * Interface du QCM
 * @author mvinet
 *
 */
public interface IQCM {
	
	/**
	 * Retourne tous les QCM 
	 * @return une liste de {@link QCM}
	 */
	List<QCM> getQcm();

	/**
	 * Retourne un {@link QCM} grâce a son id
	 * @param id l'identifiant du {@link QCM}
	 * @return un {@link QCM}
	 */
	QCM getQCM(int id);
}
