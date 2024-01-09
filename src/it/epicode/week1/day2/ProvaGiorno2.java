package it.epicode.week1.day2;
import java.util.Scanner;

public class ProvaGiorno2  { 
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Inserisci il prezzo");
		double prezzo = scanner.nextDouble(); 
		double prezzoScontato; 

		if (prezzo < 30) {
			prezzoScontato = prezzo * 0.88;
		} else { 
			prezzoScontato = prezzo * 0.75;
		}
		System.out.println("Il prezzo scontato è"); 
		System.out.println(prezzoScontato); 
		}

		
	}
