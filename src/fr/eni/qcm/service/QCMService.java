package fr.eni.qcm.service;

import java.util.ArrayList;
import java.util.List;

import fr.eni.qcm.dao.test.ITest;
import fr.eni.qcm.dao.test.TestDao;
import fr.eni.qcm.dto.QCMDTO;
import fr.eni.qcm.dto.ThemeDTO;
import fr.eni.qcm.entity.Test;
import fr.eni.qcm.entity.Section;
import fr.eni.qcm.entity.Theme;

public class QCMService {
	public List<QCMDTO> listerQCM(){
		ITest dao = TestDao.getInstance(); 
		List<Test> Qcm = dao.getTest();
		List<QCMDTO> res = new ArrayList<QCMDTO>();

		for (Test unQcm : Qcm) {
			QCMDTO dto = new QCMDTO();
			dto.setId(unQcm.getIdTest());
			dto.setLibelle(unQcm.getLibelle());
			for (Section sec : unQcm.getSections()) {
				ThemeDTO thdto = new ThemeDTO();
				thdto.setLibelle(sec.getTheme().getLibelle());
				dto.addTheme(thdto);
			}		
			res.add(dto);
		}
		
		return res;
	}
}
