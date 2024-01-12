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
            System.out.println("Seleziona il tipo di Elemento Multimediale : 1 - Audio , 2 - Video, 3 - Immagine");
            int scelta = scanner.nextInt();
            System.out.println("Scrivi un titolo per l'elemento" );
            String titolo = scanner.next();
            createElement(scelta, i, titolo, elementsArr);
        }

        //ciclo di prova per la stampa degli elementi
        for (int i = 0; i < elementsArr.length; i++){
            elementsArr[i].print();
        }

        //ciclo per la scelta e la riproduzione degli elementi

        do {
            System.out.println("Scegliendo da 1 a 5 riproduci gli elementi inseriti");
            choice = scanner.nextInt();
            if (choice == 0){
                return;
            }
            elementsArr[choice - 1].exec();
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
}
