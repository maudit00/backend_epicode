package it.epicode.week1.day2; 
import java.util.Scanner;

public class bolletta { 
	public static void main (String[] args ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il tuo consumo di acqua") ;
		int consumo = scanner.nextInt(); 
		
		double bolletta = 20;  

		if (consumo <= 100) { 
			bolletta += ( consumo * 2.5 ) ;
		} else { 
			bolletta += 250 + (consumo - 100 )  *4;
		}
		
		System.out.println("Il prezzo in bolletta sarà"); 
		System.out.println(bolletta + "€");
		
	}
}
