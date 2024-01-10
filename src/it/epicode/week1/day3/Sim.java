package it.epicode.week1.day3;

public class Sim {
    private String telNumber;
    private double credit;
    private String[] register;
    private final double cost = 0.20;
    private int avaibleSlot;

    public Sim(String number){
        this.telNumber = number;
        this.credit = 0;
        this.register = new String[5];
        this.avaibleSlot = 5;
    }
    public void recharge (double amount){
        credit += amount;
        System.out.println("Il tuo credito ora è di : " + credit);
    }
    public void call(double minutes, String number) {
        double totalCost = cost * minutes;
        if (credit < totalCost){
            return;
        }
        credit -= cost * minutes;
        String callDone = "Minuti : " + minutes + ", Numero di telefono chiamato : " + number;
        makeCall(callDone);
        System.out.println("Hai effettuato una chiamata al numero : " + number + "della durata di " + minutes + " minuti");
        System.out.println("Il credito residuo è di : " + credit);
    }

    public void printRegister (){
        for (int i = 0 ; i < register.length; i++){
            System.out.println(register[i]);
        }
    }

    public void printDetails(){
        System.out.println("Il numero della sim è : " + telNumber);
        System.out.println("Il credito della sim è : " + credit) ;
        if (register == null || register.length == 0 ) {
            System.out.println("Il registro della sim è al momento vuoto");
        }
    }

    /*
    public static String[] addCall (String[] arr, String call){

       String[] newArr = new String[arr.length + 1];
       for ( int i = 0 ; i < arr.length ; i++){
           newArr[i] = arr[i];
       }
       newArr[arr.length] = call;
       return newArr;

    } */

    public void makeCall (String call) {
        if (avaibleSlot > 0){
            register[5 - avaibleSlot] = call;
            avaibleSlot--;
       }
        for ( int i = 0 ; i < 4 ; i++){
        register[i] = register[i+1];
        }
        register[4] = call;
    }
}
