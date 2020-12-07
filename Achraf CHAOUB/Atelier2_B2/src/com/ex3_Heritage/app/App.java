package com.ex3_Heritage.app;

import java.time.LocalDate;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Secretaire p1 = new Secretaire("Chaoub","Achraf", "RIYAD", "SAFI",LocalDate.of(1983,3, 28),"AA1");
		Secretaire p2 = new Secretaire("Chaoub","Abdo", "RIYAD", "SAFI",LocalDate.of(1993,3, 14),"AA2");
		
		
		Etudiant e1 = new Etudiant("Chaoub","Achraf", "RIYAD", "SAFI",LocalDate.of(1983,3, 28),"TS");
		Etudiant e2 = new Etudiant("Chaoub","Abdo", "RIYAD", "SAFI",LocalDate.of(1993,3, 14),"BAC");
		
		p1.ecrirePersonne();
		p2.ecrirePersonne();
		e1.ecrirePersonne();
		e2.ecrirePersonne();
		
		
		System.out.println(" \nLe nombre des secretaires est : " +Secretaire.getCompteur());
		System.out.println("Le nombre des etudiants est : " +Etudiant.getCompteur());
		System.out.println("Le nombre des enseignants est : " +Enseignant.getCompteur());
	}

}
