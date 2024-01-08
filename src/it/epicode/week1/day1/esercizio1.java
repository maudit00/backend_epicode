package it.epicode.week1.day1;
import java.util.Scanner;

public class esercizio1{

	public static void main(String[] args){
		System.out.println(Moltiplica(4,4));
		String[] parole = {"ciao", "come", "stai", "caro", "amico"};
		String[] a = inserisciInArray (parole, "completamente");

		for ( int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}

	}

	public static int Moltiplica (int x, int y){
		return x * y;
	}	
	
	public static String[] inserisciInArray (String[] array, String s){
		String[] a = new String[6];
		for (int i = 0; i < a.length ; i++) {
			if ( i == 3 ) {
				a[i] = s;
			} else if ( i > 3 ) {
				a[i] = array[i-1];
			} else {
			a[i] = array[i];
			}
		}
		return a;
	}
}
