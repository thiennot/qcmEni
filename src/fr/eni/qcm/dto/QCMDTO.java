package fr.eni.qcm.dto;

import java.util.List;

public class QCMDTO {
	private int id;
	private String libelle;
	private List<ThemeDTO> themes;
	
	public QCMDTO(){
		
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

	public List<ThemeDTO> getThemes() {
		return this.themes;
	}

	public void addTheme(ThemeDTO theme) {
		this.themes.add(theme);
	}



}
