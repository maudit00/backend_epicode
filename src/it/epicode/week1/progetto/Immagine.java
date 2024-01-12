package it.epicode.week1.progetto;

public class Immagine extends ElementoMultimediale{
    private int luminosità = 5;

    //costruttore
    public Immagine (String titolo){
        super (titolo);
    }

    public void show(){
        String asterischi = "";
        for (int j = 0; j < luminosità; j++) {
            asterischi += "*";
        }
            System.out.println(getTitolo() + "--" + asterischi);
    }

    //sezione regola luminosità
    public void abbassaLuminosità(){
        if (luminosità == 0){
            System.out.println("La luminosità è a già al minimo ");
            return;
        }
        luminosità -= 1;
        System.out.println("Il luminosità ora è a : " + luminosità);
    }
    public void alzaLuminosità(){
        if (luminosità == 10){
            System.out.println("La luminosità è a già al massimo ");
            return;
        }
        luminosità += 1;
        System.out.println("Il luminosità ora è a : " + luminosità);
    }

    //sezione getter and setter
    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }
    //sezione stampa
    @Override
    public void print(){
        System.out.println(this);
    }
    @Override
    public void exec(){
        show();
    }
    @Override
    public String toString() {
        return "Immagine{" + "titolo " + getTitolo() +
                " luminosità = " + luminosità +
                '}';
    }
}
