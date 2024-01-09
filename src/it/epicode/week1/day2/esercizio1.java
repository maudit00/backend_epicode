package it.epicode.week1.day2;
import java.util.Scanner;

public class esercizio1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una stringa per vedere se il numero di caratteri è pari o dispari"); 
		String stringa = scanner.next();
		boolean pari = stringaPariDispari(stringa);
		System.out.println(pari);

		System.out.println("Inserisci un anno per controllare se è bisestile"); 
	        int year = scanner.nextInt();
		boolean bisestile = annoBisestile (year);	

		if (bisestile) { 
		System.out.println("L'anno " + year + " è bisestile");
		} else {
		System.out.println("L'anno " + year + " non è bisestile");
		}

	}

	public static boolean stringaPariDispari(String stringa){ 
		if ((stringa.length() % 2) == 0 ) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean annoBisestile (int year) { 
		if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0 ){
			return true;
		} else {
			return false;
		}
	}
}
