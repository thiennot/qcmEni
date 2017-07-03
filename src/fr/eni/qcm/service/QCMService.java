package fr.eni.qcm.service;

import java.util.List;

import fr.eni.qcm.dao.IQCM;
import fr.eni.qcm.dao.QCMDao;
import fr.eni.qcm.dto.QCMDTO;
import fr.eni.qcm.entity.QCM;

public class QCMService {
	public List<QCMDTO> listerQCM(){
		IQCM dao = QCMDao.getInstance(); 
		List<QCM> Qcm = dao.getQcm();
		List<QCMDTO> res = null;
		for (QCM unQcm : Qcm) {
			QCMDTO dto = new QCMDTO();
			dto.setId(unQcm.getIdQcm());
			dto.setLibelle(unQcm.getNomQcm());
			dto.setType(unQcm.getSection().getTheme().getLibelleTheme());
			res.add(dto);
		}
		
		return res;
	}
}
