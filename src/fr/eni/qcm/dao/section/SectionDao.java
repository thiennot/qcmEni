package fr.eni.qcm.dao.section;

import fr.eni.qcm.entity.Section;

public class SectionDao implements ISection {

	private static ISection instance;
	
	public static ISection getInstance() {
		if(instance == null) {
			instance = new MockSection();
		}
		
		return instance;
	}
	
	private SectionDao() {
		
	}

	@Override
	public Section getSection(int idSection) {
		return instance.getSection(idSection);
	}
}
