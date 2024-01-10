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
		return (height * width ) / 2;
	}
	
	public void stampaRettangolo (){
		double perimetro = perimetro();
		double area = area();
		System.out.println("Il rettangolo ha una base " + width + "e un altezza di " + height) ; 
		System.out.println("Il perimetro del rettangolo è di :" + perimetro);
		System.out.println("L'area del rettangolo è di :" + area);

	}

}
