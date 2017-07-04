package fr.eni.qcm.dao.section;

public class MockSection implements ISection {

	@Override
	public int getNombreQuestion(int idSection) {
		return 10;
	}
}
