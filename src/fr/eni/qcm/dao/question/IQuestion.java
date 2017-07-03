package fr.eni.qcm.dao.question;

import java.util.List;

import fr.eni.qcm.entity.Question;

/**
 * Interface Question
 * @author mvinet
 *
 */
public interface IQuestion {
	
	/**
	 * Retourne toutes les {@link Question} grâce a un QCM
	 * @param idQcm id du QCM
	 * @return une liste de {@link Question}
	 */
	List<Question> getQuestion(int idQcm);
	
	/**
	 * Retourne une question grâce a son id question
	 * @param idQuestion l'id de la question
	 * @return une {@link Question}
	 */
	Question findOne(int idQuestion);
	
}
