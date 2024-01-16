package it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        HashMap<String, String> contatti = new HashMap<>();
        System.out.println("Benvenuto nella mia app per la gestione rubrica telefonica");
        System.out.println(contatti);

    }
    public static void insertContact( HashMap<String, String> contacts){
        Scanner scanner = new Scanner(System.in);
        String nome;
        String numero;
        System.out.println("Inserisci il nome del tuo contatto, per terminare inserisci 0");
        nome = scanner.nextLine();
        System.out.println("Inserisci il numero del contatto :" + nome);
        numero = scanner.nextLine();
        contacts.put(nome,numero);
    }
}
