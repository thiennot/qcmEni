package fr.eni.qcm;

import org.junit.Test;

import fr.eni.qcm.dao.IQCM;
import fr.eni.qcm.dao.QCMDao;

public class TestQcmDao {

	IQCM dao = QCMDao.getInstance();
	
	@Test
	public void test() {
		assert(dao.getQcm().size() > 0);
	}

}
