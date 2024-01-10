package it.epicode.week1.day3;

import java.util.Date;

public class Cliente {
    private int code = 0;
    private String nome;
    private String cognome;
    private String email;
    private Date subscriptionDate;

    public Cliente( String nome , String cognome, String email){
        this.code = this.code + 1;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.subscriptionDate = new Date();
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void getInfo(Cliente client) {
        System.out.println("Codice cliente : " + client.code);
        System.out.println("Nome : " + client.nome);
        System.out.println("Cognome : " + client.cognome);
        System.out.println("E-Mail : " + client.email);
        System.out.println("Data di iscrizione : " + client.subscriptionDate);

    }

}
