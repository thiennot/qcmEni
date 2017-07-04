package fr.eni.qcm;

import org.junit.Test;

import fr.eni.qcm.dao.test.ITest;
import fr.eni.qcm.dao.test.TestDao;

public class TestQcmDao {

	ITest dao = TestDao.getInstance();
	
	@Test
	public void test() {
		assert(dao.getQcm().size() > 0);
	}

}
