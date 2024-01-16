package it.epicode.week2.day2; 
import java.util.*;

public class esercizio1 {
	public static void main (String[] args) {
		int n;
		String parola;
		HashSet<String> parole = new HashSet<>();
		ArrayList<String> paroleDuplicate = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci un numero di parole da inserire");
		n = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < n; i++){
		System.out.println("Inserisci la parola da salvare");
		parola = scanner.nextLine();
		if (parole.contains(parola)){
			parole.remove(parola);
			paroleDuplicate.add(parola);
		} else {
			parole.add(parola);
		}
		}


		System.out.println("Parole duplicate");
		System.out.println(paroleDuplicate);
		System.out.println("Numero parole distinte: " + parole.size());
		System.out.println("Elenco parole distinte: ");
		System.out.println(parole);
		}

	}
