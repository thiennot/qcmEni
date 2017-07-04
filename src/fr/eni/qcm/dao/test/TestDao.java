package fr.eni.qcm.dao.test;

import java.util.List;

import fr.eni.qcm.entity.Test;

/**
 * Implémentation de {@link ITest}
 * @author mvinet
 *
 */
public class TestDao implements ITest {

	/**
	 * Instance
	 */
	private static ITest instance;
	
	/**
	 * Retourne l'instnace
	 * @return une instance de {@link ITest}
	 */
	public static ITest getInstance() {
		if(instance == null) {
			instance = new TestMocks();
		}
		return instance;
	}
	
	/**
	 * Constructeur privé
	 */
	private TestDao() {
	}
	
	@Override
	public List<Test> getTest() {
		return instance.getTest();
	}

	@Override
	public Test getTest(int id) {
		return instance.getTest(id);
	}
	
}
