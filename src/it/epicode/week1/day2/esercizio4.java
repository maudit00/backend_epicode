package it.epicode.week1.day2; 
import java.util.Scanner;

public class esercizio4 {
	public static void main (String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero intero da cui far partire il conto alla rovescia");
		int start = scanner.nextInt();
		for ( int i=start; i >= 0; i--){
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
