package org.lessons.java.jsnack1;


public class RegistroStudenti {
	private Studente [] studenti;

	
	public void RegistroStudenti(int n) {
		//chiedo all'utente la lunghezza dell'array
		this.studenti = new Studente[n];
	}
		//per ogni elemento dell'array chiedo di inserire nome e cognome studente
	public void aggiungiStudente(int n, Studente input) {
			studenti[n]= input;
			n++;
	}
	
		// metodo che stampa l'array
		public void stampaStudente() {
			for( int j = 0; j < studenti.length; j++) {
				Studente currentStudent = studenti[j];
				System.out.println((j+1) + "° Studente: " + currentStudent);
			}			
		}
				
}
