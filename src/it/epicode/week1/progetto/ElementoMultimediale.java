package it.epicode.week1.progetto;

public abstract class ElementoMultimediale {
    private String titolo;
    private boolean playable;

    public ElementoMultimediale(String titolo, boolean playable ) {
        this.titolo = titolo;
        this.playable = playable;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public boolean isPlayable() {
        return playable;
    }

    public void setPlayable(boolean playable) {
        this.playable = playable;
    }
    public abstract void print();

}
