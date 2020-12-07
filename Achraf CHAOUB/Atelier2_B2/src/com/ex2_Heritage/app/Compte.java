package com.ex2_Heritage.app;

public class Compte {

	private int numeroCompte;
	private double solde;
	
	public Compte() {
		
	}

	public Compte(int numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "numeroCompte=" + numeroCompte + ", solde=" + solde;
	}
	
	
	public double ajouter(double solde) {
		double somme =0;
		somme = this.solde + solde;
		System.out.println("Ajout fait avec succes");
		setSolde(somme);
		return somme;
	}
	
	public double retirer(double solde) {
		double res =0;
		if(this.solde < solde) {
			res = this.solde -  solde;
			System.out.println("retrait fait avec succes");
		}
		else 
			System.out.println("Vous etes debuteur");
		
		setSolde(res);
		return res;
	}
	
	
}
