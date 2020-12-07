package com.ex1_Heritage.app;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Article a1 = new Article("Montre Connécté", 1200);
		Article a2= new Article("TV 42'", 4500);
		
		ArticleEnSolde a3 = new ArticleEnSolde(a1,20);
		ArticleEnSolde a4 = new ArticleEnSolde(a2,10);
		ArticleEnSolde a5 = new ArticleEnSolde("Smartphone",2000,15);
		
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		

	}

}
