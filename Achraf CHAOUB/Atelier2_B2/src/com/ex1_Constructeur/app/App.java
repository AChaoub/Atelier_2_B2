package com.ex1_Constructeur.app;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e1 = new Employe("El alami", "Mohammad", "Casablanca", 1963);
		Employe e2 = new Employe("El wahabi ", "Khalid", "SAFI", 1990);
		
		Employe e3 = new Employe();
		e3.setNom("Sbai");
		e3.setPrenom("Fouad");
		e3.setAnneeNaissance(2006);
		e3.setAdresse("SAFI");
		
		//System.out.println(e1.toString());
		e1.afficherInfosClient();
		e2.afficherInfosClient();
		e3.afficherInfosClient();
	}

}
