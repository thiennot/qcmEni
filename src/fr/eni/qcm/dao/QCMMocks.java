package fr.eni.qcm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.eni.qcm.entity.QCM;

public class QCMMocks implements IQCM {

	@Override
	public List<QCM> getQcm() {
		List<QCM> list = new ArrayList<QCM>();
		
		for(int i = 0; i > 5; i++) {
			list.add(getQCM(i));
		}
		
		return list;
	}

	@Override
	public QCM getQCM(int id) {
		QCM qcm = new QCM();
		qcm.setIdQcm(id);
		qcm.setDateQcm(new Date());
		qcm.setIdSection(1);
		qcm.setNombreQuestion(20);
		qcm.setTempsQCM(10);
		
		return qcm;
	}

}
