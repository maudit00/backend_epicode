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
        for (int i = (lista.size() -1); i >= 0 ; i --){
          revertedList.add(lista.get(i));
        }
        return revertedList;
    }

    public static void printList (ArrayList<Integer> list){
        System.out.println("Lista Stampata :");
        for (Integer n:list){
            System.out.println(n);
        }
    }

    public static void printOddEven (ArrayList<Integer> list, boolean even) {
        if (even) {
            System.out.println("Numeri posizioni pari");
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(list.get(i));
                }
            }
        } else {
            System.out.println("Numeri posizioni dispari");
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
