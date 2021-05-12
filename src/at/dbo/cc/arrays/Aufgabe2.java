package at.dbo.cc.arrays;

import java.util.Scanner;
import java.util.Random;

// Aufgabe 2 ***************************************************************************************************
// Erstelle ein Array von 50 Zufallszahlen mit Werten zwischen 0 und 100.
//Gib alle Zahlen in einem For-Loop aus und berechne gleichzeitig die Summe der Zahlen.

public class Aufgabe2 {

    public static void main(String[] args) {

        int[] zufall = new int[51];

        Random random = new Random();

        int sum = 0;

        for (int i = 1; i < zufall.length; i++) {
            int randomValue = random.nextInt(101);

            System.out.println("Zufallswert von " + i + " = " + randomValue);

            zufall[i] = randomValue;

            sum = sum + zufall[i];
        }

        System.out.println("Summe der o.g. Zufallszahlen = " + sum);

    }
}
