package fr.eni.qcm.dao.question;

import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.eni.qcm.entity.Question;

public class QuestionDao implements IQuestion {

	private static IQuestion instance;
	
	public static IQuestion getInstance() {
		if(instance == null) {
			instance = new QuestionImpl();
		}
		
		return instance;
	}
	
	@Override
	public List<Question> getQuestion(int idQcm) {
		return instance.getQuestion(idQcm);
	}

	@Override
	public Question findOne(int idQuestion) {
		return instance.findOne(idQuestion);
	}

	@Override
	public void saveReponse(Map<Integer, List<Integer>> reponse) {
		instance.saveReponse(reponse);
	}

	@Override
	public List<Question> withGoodProposition(Set<Integer> questionsId) {
		return instance.withGoodProposition(questionsId);
	}

}
