package it.epicode.week1.progetto;

public class Video extends ElementoMultimediale implements Playable{
    private int volume = 5;
    private int luminosità = 5;

    //Costruttore
    public Video(String titolo){
        super(titolo, true);
    }

    //Sezione regolazione volume
    public void abbassaVolume(){
        if (volume == 0){
            System.out.println("Il volume è a già al minimo ");
            return;
        }
        volume -= 1;
        System.out.println("Il volume ora è a : " + volume);
    }
    public void alzaVolume(){
        if (volume == 10){
            System.out.println("Il volume è a già al massimo ");
            return;
        }
        volume += 1;
        System.out.println("Il volume ora è a : " + volume);
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

    public void play() {
        String punti = "";
        String asterischi = "";
        for (int j = 0; j < volume; j++) {
            punti += "!";
        }

        for (int j = 0; j < luminosità; j++) {
            asterischi += "*";
        }

        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "--" + punti + "--" + asterischi);
        }
    }

    //Sezione getter and setter
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosità(int luminosità) {
        this.luminosità = luminosità;
    }

    //sezione stampa
    public void print(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Video{" + "titolo " + getTitolo() +
                " volume= " + volume +
                " luminosità= " + luminosità +
                '}';
    }
}
