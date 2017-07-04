package fr.eni.qcm.dao.test;

import java.util.List;

import fr.eni.qcm.entity.Test;

/**
 * Interface du QCM
 * @author mvinet
 *
 */
public interface ITest {
	
	/**
	 * Retourne tous les QCM 
	 * @return une liste de {@link Test}
	 */
	List<Test> getTest();

	/**
	 * Retourne un {@link Test} grâce a son id
	 * @param id l'identifiant du {@link Test}
	 * @return un {@link Test}
	 */
	Test getTest(int id);
}
