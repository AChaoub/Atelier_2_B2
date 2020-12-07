package com.ex1_Heritage.app;

public class Article {
	
	private String nom ;
	private double prix;
	
	public Article(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public Article() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public void afficher() {
		
		System.out.println("L'article : "+getNom()+"\tLe prix est : "+getPrix());
	}
	public String afficher(double prix) {
		
		return "Le nom du produit est  : "+getNom()+" ,et le prix d'article : "+this.getNom()+"et son prix est : "+prix;
		
	}
	
	@Override
	public String toString() {
		return  "Nom du produit = " + getNom() + " \t prix = " + getPrix();
	}
	
	
	
	
}
