package fr.eni.qcm.dao.question;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import java.util.Map;
import java.util.Set;

import fr.eni.qcm.dao.ConnectionBDD;
import fr.eni.qcm.entity.Proposition;
import fr.eni.qcm.entity.Question;

class QuestionImpl implements IQuestion{

	@Override
	public List<Question> getQuestion(int idQcm) {
		List<Question> result = new ArrayList<>();
		 
		Connection connection = ConnectionBDD.getConnection();
		String sqlQuestion = "SELECT * FROM randomizeQuestion(?)";
		String sqlProposition = "SELECT * FROM proposition where idQuestion = ?";
		String sqlQuestionTirage = "INSERT INTO question_tirage values(?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sqlQuestion);
			statement.setInt(1, idQcm);

			ResultSet resultSetQuestion = statement.executeQuery();
			
			//Boucle les questions
			while(resultSetQuestion.next()) {
				Question question = buildQuestion(resultSetQuestion);
				
				statement = connection.prepareStatement(sqlProposition);
				statement.setInt(1, resultSetQuestion.getInt("idQuestion"));
				ResultSet resultSetProposition = statement.executeQuery();

				//Ajout des proposition dans la question
				while(resultSetProposition.next()) {
					question.getPropositions().add(buildProposition(resultSetProposition));
				}
				
				result.add(question);
				
				statement = connection.prepareStatement(sqlQuestionTirage);
				statement.setBoolean(1, false); //Est Marqué
				statement.setInt(2, 0); //Id inscription TODO a modifier
				statement.setInt(3, result.get(result.size() - 1).getIdQuestion()); //id question
				statement.setBoolean(4, false); //réponse donnée
				statement.setInt(5, 0); //numero d'ordre
				statement.execute();
				
			}
			
			connection.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	

	@Override
	public Question findOne(int idQuestion) {
		return null;
	}
	
	private Proposition buildProposition(ResultSet resultSetProposition) throws SQLException {
		Proposition proposition = new Proposition();
		proposition.setCorrect(resultSetProposition.getBoolean("estbonne"));
		proposition.setEnnonce(resultSetProposition.getString("enonce"));
		proposition.setIdProposition(resultSetProposition.getInt("idproposition"));
		return proposition;
	}

	/**
	 * Construit un objet question
	 * @param resultSet le result set
	 * @return une {@link Question}
	 * @throws SQLException Si le nom est incorecte
	 */
	private Question buildQuestion(ResultSet resultSet) throws SQLException {
		Question question = new Question();
		question.setIdQuestion(resultSet.getInt("idQuestion"));
		question.setMedia(resultSet.getString("media"));
		question.setPoids(resultSet.getInt("poids"));
		question.setEnonce(resultSet.getString("enonce"));
		question.setType(resultSet.getString("type"));
		return question;
	}

	@Override
	public void saveReponse(Map<Integer, List<Integer>> reponse) {
		Connection connection = ConnectionBDD.getConnection();
		
		String sql = "INSERT INTO reponse_tirage VALUES(?, ?, ?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			
			for(Integer idQuestion : reponse.keySet()) {
				for(Integer idReponse : reponse.get(idQuestion)) {
					statement.setInt(1, idReponse);
					statement.setInt(2, idQuestion);
					statement.setInt(3, 0); //ID inscription a modifier TODO
					statement.execute();
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Question> withGoodProposition(Set<Integer> questionsId) {
		List<Question> result = new ArrayList<Question>();

		Connection connection = ConnectionBDD.getConnection();
		String sqlQuestion = "SELECT * FROM question where idquestion in (?)";
		String sqlProposition = "SELECT * FROM propostion where idquestion = ? and estbonne = 1";
		
		String questionIn = questionsId.toString().substring(1, questionsId.size() - 1);
		
		try {
			PreparedStatement statement = connection.prepareStatement(sqlQuestion);
			statement.setString(1, questionIn);
			
			ResultSet resultSetQuestion = statement.executeQuery();
			
			while(resultSetQuestion.next()) {
				Question question = buildQuestion(resultSetQuestion);
				
				statement = connection.prepareStatement(sqlProposition);
				statement.setInt(1, question.getIdQuestion());
				
				ResultSet resultSetProposition = statement.executeQuery();
				
				while(resultSetProposition.next()) {
					question.getPropositions().add(buildProposition(resultSetProposition));
				}
				
				result.add(question);
			}
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
