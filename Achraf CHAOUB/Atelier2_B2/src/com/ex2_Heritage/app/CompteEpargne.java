package com.ex2_Heritage.app;

public class CompteEpargne extends Compte {
	
	private int interet;

	public CompteEpargne() {
		super();
	}
	
	public CompteEpargne(int numeroCompte, double solde,int interet) {
		super(numeroCompte, solde);
		this.interet = interet;  
		if (solde <200) {
			super.setSolde(200);
		}

		
	}
	
	public CompteEpargne(Compte c ,int interet) {
		super(c.getNumeroCompte(),c.getSolde());
		this.interet = interet;
		if(c.getSolde() < 200) {
			super.setSolde(200);
		}
	}
	
	
	public int getInteret() {
		return interet;
	}

	public void setInteret(int interet) {
		this.interet = interet;
	}
	
	

	public double calculerInteretAnnuel() {
		return   (getInteret()* 12 * getSolde())/100;
	}

	@Override
	public String toString() {
		return  super.toString() + " Interet annuel :"+getInteret() + " interet annuel : " + calculerInteretAnnuel();
	}
	
	
}
