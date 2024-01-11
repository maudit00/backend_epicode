package it.epicode.week1.day4;

public class GestioneDipendenti {
    public static void main(String[] args) {
        int sommaPaghe = 0;
        Livello livello;

        Dipendente[] dipendenti = new Dipendente[4];
        dipendenti[0] = new Dipendente("60/bis", Dipartimento.PRODUZIONE);
        dipendenti[1] =  new Dipendente("61/bis", Dipartimento.PRODUZIONE);
        dipendenti[2] =  new Dipendente("73/bis",Dipendente.stipendioBase*1.2,35,Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE);
        dipendenti[3] = new Dipendente("78/bis",Dipendente.stipendioBase*2,45,Livello.DIRIGENTE,Dipartimento.VENDITE);

        dipendenti[1].promuovi();
        dipendenti[2].promuovi();

        for (int i = 0; i < dipendenti.length; i++){
            dipendenti[i].stampaDatiDipendente();
        }

        for (int i = 0; i < dipendenti.length; i++){
            sommaPaghe += Dipendente.calcolaPaga(dipendenti[i], 5);
        }

        System.out.println("La somma delle paghe dovute con 5 ore di straordinario è:" + sommaPaghe);

        }
    }
