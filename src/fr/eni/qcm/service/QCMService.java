package fr.eni.qcm.service;

import java.util.ArrayList;
import java.util.List;

import fr.eni.qcm.dao.qcm.IQCM;
import fr.eni.qcm.dao.qcm.QCMDao;
import fr.eni.qcm.dto.QCMDTO;
import fr.eni.qcm.dto.ThemeDTO;
import fr.eni.qcm.entity.QCM;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Theme;

public class QCMService {
	public List<QCMDTO> listerQCM(){
		IQCM dao = QCMDao.getInstance(); 
		List<QCM> Qcm = dao.getQcm();
		List<QCMDTO> res = new ArrayList<QCMDTO>();

		for (QCM unQcm : Qcm) {
			QCMDTO dto = new QCMDTO();
			dto.setId(unQcm.getIdQcm());
			dto.setLibelle(unQcm.getNomQcm());
			for (Section sec : unQcm.getSection()) {
				ThemeDTO thdto = new ThemeDTO();
				thdto.setLibelle(sec.getTheme().getLibelleTheme());
				dto.addTheme(thdto);
			}		
			res.add(dto);
		}
		
		return res;
	}
}
