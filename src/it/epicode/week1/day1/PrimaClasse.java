package it.epicode.week1.day1;
import java.util.Scanner;

public class PrimaClasse {
	public static void main(String[] args) {
		//dichiarazione e assegnazione di una variabile
		float f = 4.5f;
		// stampa della variabile
		System.out.println(f);
		//creazione di una nuova variabile e assegnazione del risultato di un metodo esterno
		double somma = somma(4,5);
		System.out.println(somma);
		//utilizzo di un metodo void con parametro statico
		benvenuto("Davide");
		//Chiedo in input il nome all'utente
		System.out.println("Inserisci il tuo nome");
		//creo un nuovo oggetto dalla classe scanner che bisogna importare per forza a meno che la classe sia nello stesso package
		Scanner scanner = new Scanner(System.in);
		String j = scanner.next();
		benvenuto(j);

	}
	public static double somma(double x, double y){
		double somma = x + y ;
		return somma; 
	}
	public static void benvenuto(String nome) {
		System.out.println("Benvenuto " + nome);
	}
}
