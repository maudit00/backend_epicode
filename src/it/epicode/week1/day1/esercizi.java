package it.epicode.week1.day1;
import java.util.Scanner;

public class esercizi{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il primo numero da moltiplicare");
		int y = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Inserisci il secondo numero da moltiplicare");
		int x = scanner.nextInt();
		System.out.println("Ecco il risultato");
		System.out.println(moltiplica(x, y));

	}

	public static int moltiplica (int x, int y){
		return x * y;
	}	
}
