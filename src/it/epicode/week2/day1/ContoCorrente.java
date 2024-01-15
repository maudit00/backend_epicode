package it.epicode.week2.day1;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente (String titolare, double saldo){
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva (double x) throws BancaException {
        if (nMovimenti < maxMovimenti){
            if ( (saldo -= x) >= 0) {
                saldo = saldo - x;
            } else {
                nMovimenti++;
                throw new BancaException("Il conto è in rosso");
            }
        }
        else {
            saldo = saldo -x -0.5;
        }
        nMovimenti++;
    }

    double restituisciSaldo(){
        return  saldo;
    }
}
