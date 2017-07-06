package fr.eni.qcm.dao.question;

import java.util.List;
import java.util.Map;

import fr.eni.qcm.entity.Question;

/**
 * Interface Question
 * @author mvinet
 *
 */
public interface IQuestion {
	
	/**
	 * Retourne toutes les {@link Question} gr�ce a un QCM
	 * @param idQcm id du QCM
	 * @return une liste de {@link Question}
	 */
	List<Question> getQuestion(int idQcm);
	
	/**
	 * Retourne une question gr�ce a son id question
	 * @param idQuestion l'id de la question
	 * @return une {@link Question}
	 */
	Question findOne(int idQuestion);
	
	
	/**
	 * Sauvegarde les question et r�ponse choisie
	 * @param reponse cle : le numero de la question, valeur la liste des r�ponses
	 */
	void saveReponse(Map<Integer, List<Integer>> reponse);
}
