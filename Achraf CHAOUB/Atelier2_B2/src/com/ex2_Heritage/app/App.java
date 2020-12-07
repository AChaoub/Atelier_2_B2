package com.ex2_Heritage.app;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Compte c1 = new Compte(1,5500);
		Compte c2= new Compte(2,14500);
		Compte c3 = new Compte(3,100);
		
		CompteEpargne c4 = new CompteEpargne(c3,10);
		CompteEpargne c5 = new CompteEpargne(5,100,40);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		

	}

}
