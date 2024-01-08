package it.epicode.week1.day1;
import java.util.Scanner; 

public class esercizio2 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String a = scanner.next();
		scanner.nextLine();
		System.out.println("Inserisci una parola");
		String b = scanner.next();
		scanner.nextLine();
		System.out.println("Inserisci una parola");
		String c = scanner.next();
		System.out.println("Ecco le stringhe concatenate");
		System.out.println( a + " " + b + " " + c) ;
		System.out.println( c + " " + b + " " + a) ;
	}

}
