package com.ex3_Heritage.app;

import java.time.LocalDate;


public class Enseignant extends Personne{
	
	private static int compteur = 0;
	private String specialite;

	
	//CONSTRUCTEURS 
	public Enseignant(String nom, String prenom, String adresse, String ville, LocalDate dateNaissance,String specialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = specialite;
		compteur ++;
		
	}
	
	public Enseignant(Personne p,String specialite) {
		super(p.getNom(),p.getPrenom(), p.getAdresse(), p.getVille(), p.getDateNaissance());
		this.specialite = specialite;
		
	}
	
	//GETTERS &SETTERS 
	
	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Enseignant.compteur = compteur;
	}

	
	
	
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public void ecrirePersonne() {
		String res ; 
		res  = "Le de la personne est  : "+super.getNom()+" et  son prénom "+super.getPrenom() +" , sa date de naissance "+super.getDateNaissance() +", son adresse : "
				+ super.getAdresse()+" , sa ville est : "+super.getVille();	
		res +=  " ,sa specialite  est : "+ getSpecialite();
		System.out.println( res);
	}


	@Override
	public String toString() {
		return	super.toString() + "Enseignant [specialite=" + getSpecialite()+ "]";
	}
	
	
	
	
	

}
