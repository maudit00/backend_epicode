package it.epicode.week1.day1;
import java.util.Scanner;

public class ProvaArray {

	public static void main (String[] args){
		// primo metodo per creare un array
		Scanner scanner = new Scanner(System.in);
		int[] numeri = new int[5];
		// ciclo per chiedere i numeri in input
		for (int i = 0; i < numeri.length; i++){
			System.out.println("Dammi un numero");
			numeri[i] = scanner.nextInt();
		}
		//ciclo per stampare i numeri nell'array

		for (int i = 0; i < numeri.length; i++){
			System.out.println(numeri[i]);
		}

		String[] giorniSettimana = {"lunedì", "martedì" , "mercoledì", "giovedì", "venerdì", "sabato", "domenica"};
		for (int i = 0; i < giorniSettimana.length; i++){
			System.out.println(giorniSettimana[i]);
		}
	}
}
