package fr.eni.qcm.dao.question;

import java.util.ArrayList;
import java.util.List;

import fr.eni.qcm.entity.Question;
import fr.eni.qcm.entity.Reponse;

public class MockQuestion implements IQuestion {

	@Override
	public List<Question> getQuestion(int idQcm) {
		
		List<Question> questions = new ArrayList<Question>();
		
		for(int i = 0; i <= 5; i++) {
			questions.add(findOne(i));
		}
		
		return questions;
	}

	@Override
	public Question findOne(int idQuestion) {
		Question question = new Question();
		
		question.setIdQuestion(idQuestion);
		question.setNomQuestion("De quelle couleur est le cheval blanc d'henri IV");
		question.setTheme(null);
		
		Reponse reponse = new Reponse();
		reponse.setCorrect(true);
		reponse.setIdReponse(1);
		reponse.setNomReponse("Blanc");
		question.getReponse().add(reponse);
		
		Reponse reponse1 = new Reponse();
		reponse1.setCorrect(false);
		reponse1.setIdReponse(2);
		reponse1.setNomReponse("Noir");
		question.getReponse().add(reponse1);
		
		return question;
	}

}
