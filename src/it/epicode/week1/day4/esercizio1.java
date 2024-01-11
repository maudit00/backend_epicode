package it.epicode.week1.day4;

public class esercizio1 {
    public static void main(String[] args) {

        Dipendente d1 = new Dipendente("77/bis", Dipartimento.VENDITE);
        d1.stampaDatiDipendente();
        d1.getLevels();
        d1.getMatricola();
        d1.setDepartments(Dipartimento.AMMINISTRAZIONE);
        d1.stampaDatiDipendente();
        Dipendente d2 = new Dipendente("78/bis",1700,15,Livello.OPERAIO,Dipartimento.VENDITE);
        d2.stampaDatiDipendente();
        d2.promuovi();
        d2.stampaDatiDipendente();
        System.out.println(Dipendente.calcolaPaga(d2, 20));
    }

}
