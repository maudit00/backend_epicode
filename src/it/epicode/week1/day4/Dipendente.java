package it.epicode.week1.day4;

import java.util.logging.Level;

public class Dipendente {
    private double stipendioBase = 1000;
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

    public Dipendente(double stipendioBase, String matricola, double stipendio, double importoOrarioStraordinario, Livello levels, Dipartimento departments) {
        this.stipendioBase = stipendioBase;
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
        System.out.println("il dipendente ha numero matricola: " + matricola);
        System.out.println("il dipendente ha uno stipendio base di: " + stipendioBase);
        System.out.println("il dipendente ha uno stipendio di: " + stipendio);
        System.out.println("L'importo orario per gli straordinari del dipendente è: " + importoOrarioStraordinario);
        System.out.println("Il livello del dipedente è: " + Levels);
        System.out.println("Il dipartimento del dipedente è: " + Departments);
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
}
