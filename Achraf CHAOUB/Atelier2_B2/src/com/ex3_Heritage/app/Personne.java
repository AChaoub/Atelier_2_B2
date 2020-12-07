package com.ex3_Heritage.app;

import java.time.LocalDate;


public abstract class Personne {
	
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private LocalDate dateNaissance;
	
	public Personne(String nom, String prenom, String adresse, String ville, LocalDate dateNaissance) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
				+ ", dateNaissance=" + dateNaissance + "]";
	}

	public void modifiePersonne (String adresse, String ville) {
		
		this.setAdresse(adresse);
		this.setVille(ville);
		
	}
	public abstract void ecrirePersonne();
	
}
