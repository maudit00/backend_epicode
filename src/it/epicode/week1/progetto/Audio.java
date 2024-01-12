package it.epicode.week1.progetto;

public class Audio extends ElementoMultimediale implements Playable {

    private int volume = 5;

    //Costruttore
    public Audio(String titolo){
        super(titolo);
    }

    //Funzioni per regolare il volume

    public void abbassaVolume(){
        if (volume == 0){
            System.out.println("Il volume di " + getTitolo() + " è a già al minimo ");
            return;
        }
        volume -= 1;
        System.out.println("Il volume di " + getTitolo() + " ora è a : " + volume);
    }
    public void alzaVolume(){
        if (volume == 10){
            System.out.println("Il volume di " + getTitolo() + " è a già al massimo ");
            return;
        }
        volume += 1;
        System.out.println("Il volume di " + getTitolo() + " ora è a : " + volume);
    }

    //Funzione play implementata da interfaccia
    public void play(){
        String punti = "";
        for (int j = 0 ; j < volume ; j++){
            punti +="!";
        }
        for ( int i = 0 ; i < durata ; i++){
            System.out.println(getTitolo() + "--" +punti);
        }
    }

    //SEZIONE GETTER AND SETTER
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    //sezione stampa
    public void print(){
        System.out.println(this);
    }
    public void exec(){
        play();
    }
    @Override
    public String toString() {
        return "Audio{" + "titolo " + getTitolo() +
                " volume = " + volume +
                '}';
    }
}
