package fr.eni.qcm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.eni.qcm.entity.QCM;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Theme;

public class QCMMocks implements IQCM {

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

		
		Theme theme1 = new  Theme();
		theme1.setCodeTheme("TestTheme");
		theme1.setDescriptionTheme("Test description");
		theme1.setIdTheme(id);
		theme1.setLibelleTheme("Libelle theme");
		section1.setTheme(theme1);
		

		Theme theme2 = new  Theme();
		theme2.setCodeTheme("TestTheme");
		theme2.setDescriptionTheme("Test description");
		theme2.setIdTheme(id);
		theme2.setLibelleTheme("Libelle theme");
		section2.setTheme(theme2);
		
		lesSections.add(section1);
		lesSections.add(section2);
		
		qcm.setSection(lesSections);
		
		return qcm;
	}

}
