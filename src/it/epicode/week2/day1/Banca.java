package it.epicode.week2.day1;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca {
    public static void main(String[] args ) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
        System.out.println("Saldo conto:" + conto1.restituisciSaldo());
        final Logger logger = LoggerFactory.getLogger("Banca");

        try {
            conto1.preleva(1750.5);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e){
            System.out.println("Errore durante il prelievo: " + e );
            e.printStackTrace();
            logger.info("Errore nel prelievo, conto in rosso" + e);
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
                conto2.stampaSaldo();

       try {
       conto2.preleva(2000);
       conto2.stampaSaldo();
       } catch (BancaException e){
            System.out.println("Errore durante il prelievo: " + e );
            e.printStackTrace();
           logger.info("Prelievo massimo raggiunto" + e);
        }
    }
}
