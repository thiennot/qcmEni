package fr.eni.qcm.dao.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.qcm.dao.ConnectionBDD;
import fr.eni.qcm.entity.Test;

class TestImpl implements ITest{

	@Override
	public List<Test> getTest() {
		List<Test> result = new ArrayList<Test>();
		
		Connection connection = ConnectionBDD.getConnection();
		String sql = "SELECT * FROM test";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				result.add(buildTest(resultSet));
			}
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Test getTest(int id) {
		Test result = null;
		Connection connection = ConnectionBDD.getConnection();
		String sql = "SELECT * FROM test WHERE idtest = ?";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			
			result = buildTest(resultSet);
			
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}


	private Test buildTest(ResultSet resultSet) throws SQLException {
		Test test = new Test();
		test.setDescription(resultSet.getString("description"));
		test.setDuree(resultSet.getInt("duree"));
		test.setIdTest(resultSet.getInt("idtest"));
		test.setLibelle(resultSet.getString("libelle"));
		test.setSeuilBas(resultSet.getInt("seuil_bas"));
		test.setSeuilHaut(resultSet.getInt("seuil_haut"));
		
		return test;
	}
	
}
