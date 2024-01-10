package it.epicode.week1.day3;

public class esercizio2 {

    public static void main(String[] args) {
        Sim sim = new Sim("3258448832");
        sim.printDetails();
        sim.recharge(10);
        sim.call(2, "3254224493");
        sim.call(1, "3254224493");
        sim.call(5.3, "3254232213");
        sim.printDetails();
        sim.printRegister();
    }

}
