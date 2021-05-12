package at.dbo.cc.arrays;

import java.util.Scanner;
import java.util.Random;

// Aufgabe 3 ***************************************************************************************************
// Sortiere ein Array mit Zahlen nach deren Wert.
// Eingabe: 8, 3, 2, 22, 8 und 1
// Ausgabe: 1, 2, 3, 8, 8 und 22

public class Aufgabe3 {

    public static void main(String[] args) {

        int[] userNumber = new int[3];
       // int[] sort = bubblesort (userNumber);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib " + userNumber.length + " Zahlen ein, ich sortiere sie dir anschließend :)");

        for (int i = 0; i < userNumber.length; i++) {
            userNumber[i] = scanner.nextInt();
        }

        for (int i = 0; i < userNumber.length; i++) {
      //      System.out.println(sort[i]);
        }
    }
}
