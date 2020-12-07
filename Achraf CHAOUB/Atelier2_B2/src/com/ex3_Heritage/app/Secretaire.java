package com.ex3_Heritage.app;

import java.time.LocalDate;


public class Secretaire extends Personne {
	private static int compteur = 0;
	private String numeroBureau;

	public Secretaire(String nom, String prenom, String adresse, String ville, LocalDate dateNaissance ,String numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.numeroBureau = numeroBureau;
		compteur++;
	}
	
	public Secretaire(Personne p,String numeroBureau) {
		super(p.getNom(), p.getPrenom(), p.getAdresse(), p.getVille(), p.getDateNaissance());
		this.numeroBureau = numeroBureau;
		compteur++;
	}
	
	
	
	public static int getCompteur() {
		return compteur;
	}
	public static void setCompteur(int compteur) {
		Secretaire.compteur = compteur;
	}
	public String getNumeroBureau() {
		return numeroBureau;
	}



	public void setNumeroBureau(String numeroBureau) {
		this.numeroBureau = numeroBureau;
	}



	public void ecrirePersonne() {
		String res ; 
		res  = "Le de la personne est  : "+super.getNom()+" et  son prénom "+super.getPrenom() +" , sa date de naissance "+super.getDateNaissance() +", son adresse : "
				+ super.getAdresse()+" , sa ville est : "+super.getVille();	
		res +=  " ,son numero de bureau est : "+ getNumeroBureau();
		System.out.println( res);
	}



	@Override
	public String toString() {
		return	super.toString() + "Secretaire [numeroBureau=" + getNumeroBureau()+ "]";
	}
	
	
	
	
}
