package it.epicode.week1.day3;

public class esercizio1 { 

	public static void main (String[] args) {

	Rettangolo r1 = new Rettangolo(5,10);
	r1.stampaRettangolo();
	Rettangolo r2 = new Rettangolo(10,20);
	r2.stampaRettangolo();
	Rettangolo.stampaDueRettangoli(r1, r2);

	}
}
