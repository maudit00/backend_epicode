package it.epicode.week1.day2; 
import java.util.Scanner;

public class esercizio3 { 
	public static void main ( String[] args) { 
		Scanner scanner = new Scanner ( System.in);
		final String exitString = ":q"; 
		String stringa; 
		do {
		System.out.println("Inserisci una stringa da separare, quando hai finito inserisci ':q' per uscire"); 
		stringa = scanner.nextLine(); 
		if (stringa.equals(exitString)){
			return;
		} else {
			String[] stringArr = stringa.split(""); 
			String stringToPrint = String.join(",", stringArr); 
			System.out.println(stringToPrint) ;
			
		}
		} while (!stringa.equals(exitString));
		
	}

}

