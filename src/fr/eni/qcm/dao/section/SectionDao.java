package fr.eni.qcm.dao.section;

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
	public int getNombreQuestion(int idSection) {
		return instance.getNombreQuestion(idSection);
	}
	
}
