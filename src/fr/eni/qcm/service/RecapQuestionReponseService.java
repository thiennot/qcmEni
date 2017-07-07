package fr.eni.qcm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import fr.eni.qcm.dao.question.IQuestion;
import fr.eni.qcm.dao.question.QuestionDao;
import fr.eni.qcm.entity.Proposition;
import fr.eni.qcm.entity.Question;

public class RecapQuestionReponseService {
	public int[] recap(HashMap<Integer, List<Integer>> questionReponses){

		IQuestion dao = QuestionDao.getInstance();


		int nbBon=0;
		int nbFaux = 0;


		List<Question> questionsJuste = dao.withGoodProposition(questionReponses.keySet());

		/*for (Integer idQuestion : questionReponses.keySet()) {
			List<Integer> idPropo = questionReponses.get(idQuestion);

			boolean juste = false;

			if(idPropo.size() == questionsJuste.get(idQuestion).getPropositions().size()){
				for (Integer lign : idPropo) {
					System.out.println(lign);
					if (inArray(lign, questionsJuste.get(idQuestion).getPropositions())) {
						juste = true;
					}	

				}

			}
		 */

		for (Question question : questionsJuste) {
			boolean juste = true;
			if (question.getPropositions().size() == questionReponses.get(question.getIdQuestion()).size() ) {
				for (Proposition propJuste : question.getPropositions()) {
					if(!inArray(propJuste.getIdProposition(),questionReponses.get(question.getIdQuestion())) ){
						juste = false;

					}
				}
			}else {
				juste = false;
			}


			if(juste){
				nbBon ++;
			}else{
				nbFaux++;
			}

		}

		int tab[] = {nbBon,nbFaux};
		return tab;
	}

	public boolean inArray(int i, List<Integer> list){
		boolean res = false;
		for (Integer id : list) {
			if(id == i){
				res = true;
			}
		}
		return res;
	}

}






