package fr.eni.qcm.service;


import java.util.List;
import java.util.Random;

import fr.eni.qcm.dao.question.IQuestion;
import fr.eni.qcm.dao.question.QuestionDao;
import fr.eni.qcm.dao.test.ITest;
import fr.eni.qcm.dao.test.TestDao;
import fr.eni.qcm.dto.PageQuestionDTO;
import fr.eni.qcm.dto.QuestionDTO;
import fr.eni.qcm.dto.ReponseDTO;
import fr.eni.qcm.entity.Question;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Test;


public class QuestionService {
	public PageQuestionDTO getQuestions(int idQCM){
		//DAO
		ITest dao = TestDao.getInstance();
		IQuestion qaoQuestion = QuestionDao.getInstance();
		//L'objet à renvoyer
		PageQuestionDTO qcmRes = new PageQuestionDTO();

		Test qcm = dao.getTest(idQCM);

		qcmRes.setChrono(qcm.getDuree());

		//les questions
		for (Section uneSection : qcm.getSections()) {
			List<Question> lesQuestions = uneSection.getTheme().getQuestions();

			for (int i = 0; i < uneSection.getNbQuestion(); i++) {

				Random rand = new Random();
				int n = rand.nextInt(lesQuestions.size()-0);
				System.out.println("nombre aleatoire : ");
				System.out.println(n);
				QuestionDTO qDTO = new QuestionDTO();
				qDTO.setIdQuestion(uneSection.getTheme().getQuestions().get(n).getIdQuestion());
				qDTO.setNomQuestion(uneSection.getTheme().getQuestions().get(n).getEnonce());
				qcmRes.addQuestion(qDTO);
			}
		}


		QuestionDTO q =new QuestionDTO();
		q.setIdQuestion(5);
		q.setNomQuestion("question ?");
		ReponseDTO r = new ReponseDTO();
		r.setId(1);
		r.setLibelle("oui");

		q.addReponse(r);
		r.setId(2);
		r.setLibelle("non");
		q.addReponse(r);

		qcmRes.addQuestion(q);
		return qcmRes;
	}
}
