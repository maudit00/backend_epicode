package it.epicode.week1.day3;

public class Rettangolo {
	private double height; 
	private double width;

	public Rettangolo(double height, double width){
		this.height = height;
		this.width = width;
	}

	public double perimetro () { 
		return (height + width ) * 2; 
	}

	public double area () { 
		return (height * width );
	}
	
	public void stampaRettangolo (){
		double perimetro = perimetro();
		double area = area();
		System.out.println("Il rettangolo ha una base " + width + " e un altezza di " + height) ; 
		System.out.println("Il perimetro del rettangolo è di : " + perimetro);
		System.out.println("L'area del rettangolo è di : " + area);

	}

	public static void stampaDueRettangoli (Rettangolo r1, Rettangolo r2) {
		double sommaPerimetro  = r1.perimetro() + r2.perimetro();
		double sommaArea = r1.area() + r2.area();
		System.out.println("il perimetro del primo rettangolo è : " + r1.perimetro() + " e la sua area è di : " + r1.area());
		System.out.println("il perimetro del secondo rettangolo è : " + r2.perimetro() + " e la sua area è di : " + r2.area());
		System.out.println("La somma dei perimetri è : " + sommaPerimetro + " mentre la somma delle aree è di : " + sommaArea);
	}
}
