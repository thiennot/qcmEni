package fr.eni.qcm.dao.section;

import fr.eni.qcm.entity.Proposition;
import fr.eni.qcm.entity.Question;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Theme;

public class MockSection implements ISection {

	@Override
	public Section getSection(int idSection) {
		Section section = new Section();
		section.setNbQuestion(2);
		
		Theme theme = new Theme();
		theme.setIdTheme(1);
		theme.setLibelle("Test");

		Question q1 = new Question();
		q1.setEnonce("De quelle couleur est la couleur blanche ?");
		q1.setIdQuestion(1);
		q1.setPoids(2);
		q1.setType("simple");

		Proposition p1 = new Proposition();
		p1.setCorrect(true);
		p1.setEnnonce("Blanche");
		p1.setIdProposition(1);
		p1.setQuestion(q1);

		Proposition p2 = new Proposition();
		p2.setCorrect(false);
		p2.setEnnonce("Noir");
		p2.setIdProposition(1);
		p2.setQuestion(q1);
		
		q1.getPropositions().add(p1);
		q1.getPropositions().add(p2);
		
		theme.getQuestions().add(q1);
		section.setTheme(theme);
		
		return section;
	}
}
