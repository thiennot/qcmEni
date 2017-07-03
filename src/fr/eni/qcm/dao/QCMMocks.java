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
		
		
		Section section = new Section();
		section.setIdSection(id);
		section.setNombreQuestion(20);
		section.setNomSection("Test");

		Theme theme = new  Theme();
		theme.setCodeTheme("TestTheme");
		theme.setDescriptionTheme("Test description");
		theme.setIdTheme(id);
		theme.setLibelleTheme("Libelle theme");
		section.setTheme(theme);
		
		qcm.setSection(section);
		
		return qcm;
	}

}
