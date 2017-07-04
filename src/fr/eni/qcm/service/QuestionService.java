package fr.eni.qcm.service;


import fr.eni.qcm.dao.test.ITest;
import fr.eni.qcm.dao.test.TestDao;
import fr.eni.qcm.dto.PageQuestionDTO;
import fr.eni.qcm.dto.QCMDTO;
import fr.eni.qcm.dto.QuestionDTO;
import fr.eni.qcm.dto.ReponseDTO;
import fr.eni.qcm.entity.Test;


public class QuestionService {
	public PageQuestionDTO getQuestions(int idQCM){
		ITest dao = TestDao.getInstance();
		PageQuestionDTO qcmRes = new PageQuestionDTO();
		Test qcm = dao.getQCM(idQCM);
		qcmRes.setChrono((int)qcm.getDuree());
		
		//questions bidons
		
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
