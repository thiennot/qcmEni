package fr.eni.qcm.dao.test;

import java.util.ArrayList;
import java.util.List;

import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Test;
import fr.eni.qcm.entity.Theme;

class TestMocks implements ITest {

	@Override
	public List<Test> getTest() {
		List<Test> list = new ArrayList<Test>();
		
		for(int i = 0; i <= 5; i++) {
			list.add(getTest(i));
		}
		
		return list;
	}

	@Override
	public Test getTest(int id) {
		Test qcm = new Test();
		qcm.setIdTest(id);
		qcm.setDuree(10);
		qcm.setLibelle("Test " + id);
		qcm.setSeuilBas(2);
		qcm.setSeuilHaut(10);
		
		List<Section> lesSections = new ArrayList<Section>();
		
		Section section1 = new Section();
		section1.setNbQuestion(10);
		section1.setTest(qcm);
		
		Theme theme = new  Theme();
		theme.setIdTheme(1);
		theme.setLibelle("Theme " + id);
		theme.getSections().add(section1);
		
		section1.setTheme(theme);
		
		lesSections.add(section1);
		
		qcm.setSections(lesSections);
		
		return qcm;
	}

}
