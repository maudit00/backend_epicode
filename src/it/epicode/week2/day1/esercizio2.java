package it.epicode.week2.day1;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.slf4j.ILoggerFactory;
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
        System.out.println("Inserisci il numero di litri consumati nel percorso");
        litro = scanner.nextInt();

        try {
            System.out.println("Rapporto km per litro");
            System.out.println(km/litro);
        } catch (ArithmeticException e ){
            System.out.println("Hai inserito litri consumati = 0, non posso dividere per 0");
            logger.info("Effettuata divisione per 0");
        }

    }

}
