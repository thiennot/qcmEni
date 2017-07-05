package fr.eni.qcm.dto;

public class PropositionDTO {
	private int id;
	private String libelle;
	private boolean favori;
	
	public PropositionDTO(){
		this.favori = false;
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

	public boolean isFavori() {
		return favori;
	}

	public void setFavori(boolean favori) {
		this.favori = favori;
	}


	
}
