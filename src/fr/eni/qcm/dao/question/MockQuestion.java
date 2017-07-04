package fr.eni.qcm.dao.question;

import java.util.ArrayList;
import java.util.List;

import fr.eni.qcm.entity.Proposition;
import fr.eni.qcm.entity.Question;

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
		question.setEnonce("De quelle couleur est le cheval blanc d'henri IV");
		
		Proposition reponse = new Proposition();
		reponse.setCorrect(true);
		reponse.setIdProposition(1);
		reponse.setEnnonce("Blanc");
		reponse.setQuestion(question);
		question.getPropositions().add(reponse);
		
		Proposition reponse1 = new Proposition();
		reponse1.setCorrect(false);
		reponse1.setIdProposition(2);
		reponse1.setEnnonce("Noir");
		reponse1.setQuestion(question);
		question.getPropositions().add(reponse1);
		
		return question;
	}

}
