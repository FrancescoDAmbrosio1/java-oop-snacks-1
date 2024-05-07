package org.lessons.java.jsnack1;


public class RegistroStudenti {
	private Studente [] studenti;
	int indice = 0;

	
	public void RegistroStudenti(int indice) {
		//chiedo all'utente la lunghezza dell'array
		this.studenti = new Studente[indice];
	}
		//per ogni elemento dell'array chiedo di inserire nome e cognome studente
	public void aggiungiStudente(int indice, Studente input) {
			studenti[indice]= input;
	}
	
		// metodo che stampa l'array
		public void stampaStudente() {
			for( int j = 0; j < studenti.length; j++) {
				Studente currentStudent = studenti[j];
				System.out.println((j+1) + "° Studente: " + currentStudent);
			}			
		}
				
}
