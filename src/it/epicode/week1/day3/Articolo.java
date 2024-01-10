package it.epicode.week1.day3;

public class Articolo {
    private int code = 0;
    private String description ;
    private double price;
    private int stock;

    public Articolo ( String description, double price, int stock){
        this.code = this.code + 1;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public static void getInfo(Articolo art){
        System.out.println("Il codice dell'articolo è : " + art.code);
        System.out.println("Il prezzo dell'articolo è : " + art.price);
        System.out.println("La descrizione dell'articolo è : " + art.description);
        System.out.println("Il numero dei pezzi in magazzino per l'articolo è : " + art.stock);
    }
}
