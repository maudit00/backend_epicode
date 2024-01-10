package it.epicode.week1.day3;

public class esercizio3 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente ("Davide", "D'Amario", "davide1193@gmail.com") ;
        Cliente.getInfo(c1);
        Articolo a1 = new Articolo ("Sparafoglie", 5, 19);
        Articolo.getInfo(a1);
    }
}
