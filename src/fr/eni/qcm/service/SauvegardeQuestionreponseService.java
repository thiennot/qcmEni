package fr.eni.qcm.service;

import java.util.HashMap;
import java.util.List;

import fr.eni.qcm.dao.question.IQuestion;
import fr.eni.qcm.dao.question.QuestionDao;

public class SauvegardeQuestionreponseService {
	public void sauvegarde(HashMap<Integer, List<Integer>> questionReponses){
		IQuestion dao = QuestionDao.getInstance();
		dao.saveReponse(questionReponses);
	}
}
