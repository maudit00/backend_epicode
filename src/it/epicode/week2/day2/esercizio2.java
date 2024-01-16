package it.epicode.week2.day2;
import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.util.*;

public class esercizio2 {
    public static void main(String[] args) {
        int n;
        Random randomNumber = new Random();
        ArrayList<Integer> lista = new ArrayList<>();


        System.out.println("Inserisci la lunghezza della lista");
        n = randomNumber.nextInt();

        for (int i = 0; i < n ; i++){
            int randNum = randomNumber.nextInt(100) + 1 ;
            System.out.println(randNum);
            lista.add(randNum);
        }

        printList(lista);


    }

    public static ArrayList<Integer> revertList(ArrayList<Integer> lista){
        ArrayList<Integer> revertedList = new ArrayList<>();
        for (int i = (lista.size() -1); i == 0 ; i --){
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
}
