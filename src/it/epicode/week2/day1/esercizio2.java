package it.epicode.week2.day1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        int km;
        int litro;
        final Logger logger = LoggerFactory.getLogger("esercizio2");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di KM percorsi dall'auto");
        km = scanner.nextInt();
        logger.info("Presi KM in input");
        System.out.println("Inserisci il numero di litri consumati nel percorso");
        litro = scanner.nextInt();
        logger.info("Presi litri in input");


        try {
            System.out.println("Rapporto km per litro");
            System.out.println(km/litro);
        } catch (ArithmeticException e ){
            logger.error("Effettuata divisione per 0");
        }

    }

}
