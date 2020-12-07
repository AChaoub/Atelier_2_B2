package com.ex3_Heritage.app;

import java.time.LocalDate;


public class Etudiant extends Personne {
	
	private static int compteur = 0;
	private String diplome ;
	 
	public Etudiant(String nom, String prenom, String adresse, String ville, LocalDate dateNaissance,String diplome) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.diplome = diplome;
		compteur ++;
	}
	
	public Etudiant(Personne p,String diplome) {
		super(p.getNom(),p.getPrenom(), p.getAdresse(), p.getVille(), p.getDateNaissance());
		this.diplome = diplome;
		compteur ++;
	}

	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Etudiant.compteur = compteur;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	
	public void ecrirePersonne() {
		String res ; 
		res  = "Le de la personne est  : "+super.getNom()+" et  son prénom "+super.getPrenom() +" , sa date de naissance "+super.getDateNaissance() +", son adresse : "
				+ super.getAdresse()+" , sa ville est : "+super.getVille();	
		res +=  " ,son diplome  est : "+ getDiplome() +" , et le nombre des etudiants dans ce classe : " +getCompteur();
		System.out.println( res);
	}


	@Override
	public String toString() {
		return	super.toString() + "Etudiant [ diplome=" + getDiplome()+ "]" + " [ diplome=" + getCompteur()+ "]" ;
	}
	
	 
	 
	 
	

}
