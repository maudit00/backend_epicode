package it.epicode.week2.day1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);
        final Logger logger = LoggerFactory.getLogger("esercizio1");

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(10) + 1;
            System.out.println(array[i]);
        }
        logger.info("Array creato");

        insertInArray(array);

    }

    public static void insertInArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int position;
        int exitingNumber = 0;

        do {
        System.out.println("Inserisci un numero");
        number = scanner.nextInt();
        if (number == 0){
            System.out.println("Sei uscito dal menu inserimento");
            continue;
        }
        try {
            System.out.println("Inserisci la posizione dell'array in cui inserirlo, le scelte sono da 1-5");
            position = scanner.nextInt();
            arr[position - 1] = number;
            printNewArr(arr);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hai inserito un indice non esistente");
            insertInArray(arr);
        }
    } while (number != exitingNumber);
    }

    public static void printNewArr(int[] arr){
        System.out.println("Ecco il nuovo array");
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
