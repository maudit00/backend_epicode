package it.epicode.week1.day4;

import java.util.logging.Level;

public class Dipendente {
    public final static double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello Levels;
    private Dipartimento Departments;

    public Dipendente (String matricola, Dipartimento Dipartimento){
        this.matricola = matricola ;
        this.Departments = Dipartimento;
        this.stipendio = this.stipendioBase;
        this.importoOrarioStraordinario = 30 ;
        this.Levels = Livello.OPERAIO;
    }

    public Dipendente( String matricola, double stipendio, double importoOrarioStraordinario, Livello levels, Dipartimento departments) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        Levels = levels;
        Departments = departments;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLevels() {
        return Levels;
    }

    public Dipartimento getDepartments() {
        return Departments;
    }

    public void setDepartments(Dipartimento departments) {
        Departments = departments;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void stampaDatiDipendente (){
        System.out.println(this);
    }

    public Livello promuovi(){
        switch (Levels){
            case OPERAIO :
                Levels = Livello.IMPIEGATO;
                stipendio = stipendioBase * 1.2;
                return Levels;
            case IMPIEGATO:
                Levels = Livello.QUADRO;
                stipendio = stipendioBase * 1.5;
                return Levels;
            case QUADRO:
                Levels = Livello.DIRIGENTE;
                stipendio = stipendioBase * 2;
                return Levels;
            case DIRIGENTE:
                System.out.println("Errore - il dipendente è già al massimo dei Livelli Aziendali");
                return Levels;
            case null, default: return Levels;

        }
    }

    public static double calcolaPaga (Dipendente dipendente){
        return dipendente.stipendio;
    }
    public static double calcolaPaga (Dipendente dipendente, int oreStrao){
        return dipendente.stipendio + (oreStrao * dipendente.importoOrarioStraordinario);
    }


    @Override
    public String toString() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", Levels=" + Levels +
                ", Departments=" + Departments +
                '}';
    }
}
