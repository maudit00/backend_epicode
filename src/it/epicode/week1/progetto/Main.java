package it.epicode.week1.progetto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int exitChoice = 0;
        int choice;
        ElementoMultimediale[] elementsArr = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);

        //frase di benvenuto
        System.out.println("Benvenuto nel mio lettore multimediale");

        //ciclo per la richiesta input e l'inserimento dati in array
        for (int i = 0 ; i < elementsArr.length ; i++){
            //ciclo per gestire l'errore nella scelta del tipo
            do {
                System.out.println("Seleziona il tipo di Elemento Multimediale : 1 - Audio , 2 - Video, 3 - Immagine");
                choice = scanner.nextInt();
                if (choice == 0 || choice > 3){
                    System.out.println("Scelta non corretta, ripetere la scelta da 1 a 3");
                }
            } while ( choice == 0 || choice > 3 );

            scanner.nextLine();
            System.out.println("Scrivi un titolo per l'elemento" );
            String titolo = scanner.nextLine();
            createElement(choice, i, titolo, elementsArr);
        }

        //ciclo di prova per la stampa degli elementi
        printArr(elementsArr);

        //test metodi delle sottoclassi

        Audio a1 = new Audio("canzone");
        a1.abbassaVolume();
        a1.alzaVolume();
        Video v1 = new Video ("video");
        v1.abbassaVolume();
        v1.alzaVolume();
        v1.alzaLuminosità();
        v1.abbassaLuminosità();
        Immagine i1 = new Immagine("picture");
        i1.alzaLuminosità();
        i1.alzaLuminosità();

        //ciclo per la scelta e la riproduzione degli elementi
        do {
            System.out.println("Scegliendo da 1 a 5 riproduci gli elementi inseriti o inserisci 0 per uscire dal programma");
            choice = scanner.nextInt();
             if (choice > 5) {
                System.out.println("Scelta non disponibile");
            } else if (choice > 0) {
                elementsArr[choice - 1].exec();
            }
        } while (choice != exitChoice);
    }

    // funzione per la creazione del giusto elemento multimediale e aggiunta nell'array
    public static void createElement (int scelta, int posizione, String titolo, ElementoMultimediale[] array){
        switch (scelta){
            case 1 :
                array[posizione] = new Audio(titolo);
                break;
            case 2 :
                array[posizione] = new Video(titolo);
                break;
            case 3 :
                array[posizione] = new Immagine(titolo);
                break;
            default :
                System.out.println("La scelta non è corretta");
                break;
        }
    }

    public static void printArr(ElementoMultimediale[] array){
        for (int i = 0; i < array.length; i++){
            array[i].print();
        }
    }

}
