package it.epicode.week2.day2;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.util.*;

public class esercizio2 {
    public static void main(String[] args) {
        int n;
        Random randomNumber = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza della lista");
        n = scanner.nextInt();

        for (int i = 0; i < n ; i++){
            int randNum = randomNumber.nextInt(100) + 1 ;
            lista.add(randNum);
        }

        printList(lista);
        printList(revertList(lista));
        printOddEven(lista, true);
        printOddEven(lista, false);

    }

    public static ArrayList<Integer> revertList(ArrayList<Integer> lista){
        ArrayList<Integer> revertedList = new ArrayList<>();
        revertedList.addAll(lista);
        revertedList.addAll(lista.reversed());
        return revertedList;
    }

    public static void printList (ArrayList<Integer> list){
        System.out.println("Lista Stampata :");
        for (Integer n:list){
            System.out.println(n);
        }
    }

    public static void printOddEven (ArrayList<Integer> list, boolean even) {
        System.out.println(even ? "Lista pari per posizione" : "Lista dispari per posizione");
        for (int i = 0; i < list.size(); i++){
            if(even && i % 2 == 0){
                System.out.println("Posizione: " + i + " " +list.get(i));
            } else if (!even && i % 2 != 0){
                System.out.println("Posizione: " + i + " " +list.get(i));
            }
        }
    }
}
