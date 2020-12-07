package com.ex1_Heritage.app;

public class ArticleEnSolde extends Article {

	private double pourcentage;
	 
	public ArticleEnSolde() {
		super();
	}

	public ArticleEnSolde(String nom, double prix , double pourcentage) {
		super(nom, prix);
		this.pourcentage = pourcentage;
		
		// TODO Auto-generated constructor stub
	}
	
	public ArticleEnSolde(Article a, double pourcentage) {
		super(a.getNom(), a.getPrix());
		this.pourcentage = pourcentage;
		// TODO Auto-generated constructor stub
	}

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	
	public double calculerRemise() {
		return this.getPrix() * (getPourcentage()/100) ;
	}

 
	
	@Override
	public String toString() {
		return  super.toString() + " avec une remise de "+ getPourcentage() + "%  --> "   + calculerRemise()+ " dhs, et le prix inclus la remise " + (this.getPrix()- calculerRemise())+" Dhs";
	}
	 
	
	

}
