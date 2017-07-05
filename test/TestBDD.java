import static org.junit.Assert.assertTrue;

import java.sql.Connection;

import org.junit.Test;

import fr.eni.qcm.dao.ConnectionBDD;
import fr.eni.qcm.dao.question.IQuestion;
import fr.eni.qcm.dao.question.QuestionDao;
import fr.eni.qcm.dao.test.ITest;
import fr.eni.qcm.dao.test.TestDao;


public class TestBDD {

	@Test
	public void testConnection() {
		Connection connection = ConnectionBDD.getConnection();
		assertTrue(connection != null);
	}

	@Test
	public void testTest() {
		ITest test = TestDao.getInstance();
		assertTrue(test.getTest(0) != null);
	}
	
	@Test
	public void testQuestion() {
		IQuestion question = QuestionDao.getInstance();
		assertTrue(question.getQuestion(0).size() > 0 );
	}
	
}
