package org.lessons.java.jsnack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		RegistroStudenti nuovoStudente = new RegistroStudenti();
		Scanner input = new Scanner (System.in);
		
		System.out.print("Indicare da quanti studenti sarà composto il registro: ");
		int n = input.nextInt();
		
		nuovoStudente.RegistroStudenti(n);
		
		// itera per la lunghezza dell'array e chiede all'utente di inserire i dati
		for(int i = 0; i < n ; i++) {
			System.out.println("Indicare Cognome del " + (i+1) + "° Studente: ");
			String name = input.next();
			System.out.println("Indicare Nome del " + (i+1) + "° Studente: ");
			String surname = input.next();
			nuovoStudente.aggiungiStudente(n-1, new Studente(name, surname));
		}
		nuovoStudente.stampaStudente();
	}
}

