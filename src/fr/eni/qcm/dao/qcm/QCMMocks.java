package fr.eni.qcm.dao.qcm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.eni.qcm.entity.QCM;
import fr.eni.qcm.entity.Question;
import fr.eni.qcm.entity.Reponse;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Theme;

class QCMMocks implements IQCM {

	@Override
	public List<QCM> getQcm() {
		List<QCM> list = new ArrayList<QCM>();
		
		for(int i = 0; i <= 5; i++) {
			list.add(getQCM(i));
		}
		
		return list;
	}

	@Override
	public QCM getQCM(int id) {
		QCM qcm = new QCM();
		qcm.setIdQcm(id);
		qcm.setDateQcm(new Date());
		qcm.setNombreQuestion(20);
		qcm.setTempsQCM(10);
		qcm.setNomQcm("Test " + id);
		
		List<Section> lesSections = new ArrayList<Section>();
		
		Section section1 = new Section();
		section1.setIdSection(1);
		section1.setNombreQuestion(20);
		section1.setNomSection("Test");

		Section section2 = new Section();
		section2.setIdSection(2);
		section2.setNombreQuestion(20);
		section2.setNomSection("Test");

		
		Theme theme = new  Theme();
		theme.setCodeTheme("TestTheme");
		theme.setDescriptionTheme("Test description");
		theme.setIdTheme(id);
		theme.setLibelleTheme("Libelle theme");
		
		List<Reponse> response = new ArrayList<Reponse>();
		List<Question> questions = new ArrayList<Question>();

		Question q = new Question();
		q.setIdQuestion(1);
		q.setNomQuestion("Les poules ont t'il des dents ?");
		q.setTheme(theme);
		
		Reponse r = new Reponse();
		r.setCorrect(false);
		r.setIdReponse(1);
		r.setNomReponse("Oui");
		r.setQuestion(q);
		response.add(r);
		
		Reponse r1 = new Reponse();
		r.setCorrect(true);
		r.setIdReponse(2);
		r.setNomReponse("Non");
		r.setQuestion(q);
		response.add(r1);
		
		q.setReponse(response);
		questions.add(q);
		
		theme.setQuestions(questions);
		
		section1.setTheme(theme);
		section2.setTheme(theme);
		
		lesSections.add(section1);
		lesSections.add(section2);
		
		qcm.setSection(lesSections);

		
		
		return qcm;
	}

}
