package it.epicode.week1.day4;

public class GestioneDipendenti {
    public static void main(String[] args) {
        int sommaPaghe = 0;

        Dipendente d1 = new Dipendente(1000,"70/bis",1000,20,Livello.OPERAIO,Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente(1000,"71/bis",1200,20,Livello.OPERAIO,Dipartimento.PRODUZIONE);
        Dipendente d3 = new Dipendente(1500,"73/bis",1700,15,Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE);
        Dipendente d4 = new Dipendente(1500,"78/bis",1700,15,Livello.DIRIGENTE,Dipartimento.VENDITE);

        Dipendente[] dipendenti = new Dipendente[4];
        dipendenti[0] = d1;
        dipendenti[1] = d2;
        dipendenti[2] = d3;
        dipendenti[3] = d4;

        d2.promuovi();
        d3.promuovi();

        for (int i = 0; i < dipendenti.length; i++){
            dipendenti[i].stampaDatiDipendente();
        }

        for (int i = 0; i < dipendenti.length; i++){
            sommaPaghe += Dipendente.calcolaPaga(dipendenti[i], 5);
        }

        System.out.println("La somma delle paghe dovute con 5 ore di straordinario è:" + sommaPaghe);

    }
}
