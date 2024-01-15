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
            conto1.preleva(111750.5);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e){
            e.printStackTrace();
            logger.error("Errore nel prelievo, conto in rosso" + e);
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
                conto2.stampaSaldo();

       try {
       conto2.preleva(2000);
       conto2.stampaSaldo();
       } catch (BancaException e){
           e.printStackTrace();
           logger.error("Prelievo massimo raggiunto" + e);
        }
    }
}
