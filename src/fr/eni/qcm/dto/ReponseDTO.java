package fr.eni.qcm.dto;

public class ReponseDTO {
	private int id;
	private String libelle;
	private boolean correcte;
	
	public ReponseDTO(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public boolean isCorrecte() {
		return correcte;
	}

	public void setCorrecte(boolean correcte) {
		this.correcte = correcte;
	}
	
	
	
}
