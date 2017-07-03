package fr.eni.qcm.dao;

import java.util.List;

import fr.eni.qcm.entity.QCM;

/**
 * Impl�mentation de {@link IQCM}
 * @author mvinet
 *
 */
public class QCMDao implements IQCM {

	/**
	 * Instance
	 */
	private static IQCM instance;
	
	/**
	 * Retourne l'instnace
	 * @return une instance de {@link IQCM}
	 */
	public IQCM getInstance() {
		if(instance == null) {
			instance = new QCMMocks();
		}
		return instance;
	}
	
	/**
	 * Constructeur priv�
	 */
	private QCMDao() {
	}
	
	@Override
	public List<QCM> getQcm() {
		return null;
	}

	@Override
	public QCM getQCM(int id) {
		return null;
	}
	
}
