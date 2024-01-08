package it.epicode.week1.day1;
import java.util.Scanner;

public class esercizio3 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci la lunghezza del lato corto del rettangolo");
		double lc = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Inserisci la lunghezza del lato lungo del rettangolo");
		double ll = scanner.nextDouble();
		System.out.println("Il perimetro del rettangolo è");
		System.out.println(perimetroRettangolo(lc, ll));
		scanner.nextLine();
		System.out.println("Inserisci un numero per vedere se pari o dispari");
		int x = scanner.nextInt();
		System.out.println("Se il numero è pari il risultato sarà 0, altrimenti 1");
		System.out.println(pariDispari(x));
		scanner.nextLine();
		System.out.println("Inserisci la lunghezza del lato A di un triangolo"); 
		double a = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Inserisci la lunghezza del lato B di un triangolo"); 
		double b = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Inserisci la lunghezza del lato B di un triangolo"); 
		double c = scanner.nextDouble();
		System.out.println("L'area del triangolo è:");
		System.out.println(areaTriangolo(a, b,c));
		
		

	}

	public static double perimetroRettangolo (double x, double y){
		return (x + y) * 2; 
	}

	public static int pariDispari (int x){
		if (x % 2 == 0){
			return 0;
		} else return 1;
	}

	public static double areaTriangolo(double a, double b, double c) {
		double p = (a + b + c )/ 2;
		double area = p*(p-a)*(p-b)*(p-c);
		return Math.sqrt(area);
	}

}

