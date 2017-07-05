package fr.eni.qcm.dao.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.qcm.dao.ConnectionBDD;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Test;
import fr.eni.qcm.entity.Theme;

class TestImpl implements ITest{

	@Override
	public List<Test> getTest() {
		List<Test> result = new ArrayList<Test>();
		
		Connection connection = ConnectionBDD.getConnection();
		String sqlTest = "SELECT * FROM test";
		String sqlSection = "SELECT * FROM section_test s, theme t WHERE t.idtheme = s.idtheme AND idtest = ?";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sqlTest);
			ResultSet resultTest = statement.executeQuery();
			
			while(resultTest.next()) {
				Test test = buildTest(resultTest);
				
				statement = connection.prepareStatement(sqlSection);
				statement.setInt(1, test.getIdTest());
				
				ResultSet resultSection = statement.executeQuery();
				
				while(resultSection.next()) {
					Section section = buildSection(resultSection);
					test.getSections().add(section);
				}
				   
				result.add(test);
				
			}
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	private Section buildSection(ResultSet resultSection) throws SQLException {
		Section section = new Section();
		section.setNbQuestion(resultSection.getInt("nbquestionsatirer"));
		
		Theme theme = new Theme();
		theme.setIdTheme(resultSection.getInt("idtheme"));
		theme.setLibelle(resultSection.getString("libelle"));

		section.setTheme(theme);
		
		return section;
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
