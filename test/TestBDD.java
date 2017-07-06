import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import fr.eni.qcm.dao.ConnectionBDD;
import fr.eni.qcm.dao.question.IQuestion;
import fr.eni.qcm.dao.question.QuestionDao;
import fr.eni.qcm.dao.test.ITest;
import fr.eni.qcm.dao.test.TestDao;
import fr.eni.qcm.entity.Question;


public class TestBDD {

	@Test
	public void testConnection() {
		Connection connection = ConnectionBDD.getConnection();
		assertTrue(connection != null);
	}

	@Test
	public void testTest() {
		ITest test = TestDao.getInstance();
		assertTrue(test.getTest() != null);
	}
	
	@Test
	public void testQuestion() {
		IQuestion question = QuestionDao.getInstance();
		//assertTrue(question.getQuestion(0).size() > 0 );
	}
	
	@Test
	public void testQuestionWithGoodProposition() {
		IQuestion question = QuestionDao.getInstance();
		Set<Integer> test = new HashSet<Integer>();
		test.add(0);
		assertTrue(question.withGoodProposition(test) != null);
	}
	
}
