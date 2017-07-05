package fr.eni.qcm.service;


import java.util.List;
import java.util.Random;

import fr.eni.qcm.dao.question.IQuestion;
import fr.eni.qcm.dao.question.QuestionDao;
import fr.eni.qcm.dao.test.ITest;
import fr.eni.qcm.dao.test.TestDao;
import fr.eni.qcm.dto.PageQuestionDTO;
import fr.eni.qcm.dto.PropositionDTO;
import fr.eni.qcm.dto.QuestionDTO;
import fr.eni.qcm.entity.Proposition;
import fr.eni.qcm.entity.Question;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Test;


public class QuestionService {
	public PageQuestionDTO getQuestions(int idQCM){
		//DAO
		IQuestion questionDAO = QuestionDao.getInstance();
		ITest testDAO = TestDao.getInstance();
		
		//L'objet à renvoyer
		PageQuestionDTO qcmRes = new PageQuestionDTO();

		List<Question> questions = questionDAO.getQuestion(idQCM);
		
		
		qcmRes.setChrono(testDAO.getTest(idQCM).getDuree());

		for (Question uneQuestion : questions) {
			QuestionDTO questDTO =new QuestionDTO();
			PropositionDTO propDTO;
		    questDTO.setIdQuestion(uneQuestion.getIdQuestion());
			questDTO.setNomQuestion(uneQuestion.getEnonce());
			questDTO.setBalise(uneQuestion.getType());
			for (Proposition prop : uneQuestion.getPropositions()) {
				propDTO = new PropositionDTO();
				propDTO.setId(prop.getIdProposition());
				propDTO.setLibelle(prop.getEnnonce());
				questDTO.addProposition(propDTO);
			}
		
			qcmRes.addQuestion(questDTO);
		}
		
		return qcmRes;
	}
}
