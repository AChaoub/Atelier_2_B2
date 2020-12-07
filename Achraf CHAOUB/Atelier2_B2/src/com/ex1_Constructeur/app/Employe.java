package com.ex1_Constructeur.app;

import java.util.Calendar;

public class Employe {
	
	private	String nom ;
	private	String prenom ;
	private String adresse;
	private int intanneeEncours ;
	private	int anneeNaissance ; 
	
	

	// CONSTRUCTEUR PERSONNALISE & CONSTRUCTEUR PAR DEFFAUT 
	public Employe(String nom, String prenom, String adresse, int anneeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.anneeNaissance = anneeNaissance;
		this.intanneeEncours = this.getAnneeCourante();
	}
	
	public Employe() {
		
	}
	
	

	// GETTERS & SETTERS
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

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public int getIntanneeEncours() {
		return intanneeEncours;
	}

	// METHODE GHIR RETURNE L'ANNEE COURANTE
	public int getAnneeCourante(){
        Calendar c = Calendar.getInstance();
        int res = c.get(Calendar.YEAR);
        return res;
    }

	@Override
	public String toString() {
		return "Employe nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", intanneeEncours="
				+ intanneeEncours + ", anneeNaissance=" + anneeNaissance;
	}
	
	public int CalculerAge() {
		return getAnneeCourante() - this.anneeNaissance ;
	}
	
	public void afficherInfosClient() {
		System.out.println(getNom().toUpperCase() + " " +getPrenom() +", né le "+getAnneeNaissance()+" à " +getAdresse()+" et son age est "+CalculerAge()+".");
	}
	
	
}
