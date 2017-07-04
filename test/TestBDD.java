import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import fr.eni.qcm.dao.ConnectionBDD;


public class TestBDD {

	@Test
	public void test() {
		Connection connection = ConnectionBDD.getConnection();
		assertTrue(connection != null);
	}

}
