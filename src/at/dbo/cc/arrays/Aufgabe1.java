package at.dbo.cc.arrays;

import java.util.Scanner;
import java.util.Random;

// Aufgabe 1: Erstelle ein Array von 10 ganzen Zahlen. Gehe das Array in einem Loop durch und berechne die Summe!

public class Aufgabe1 {

    public static void main(String[] args) {

        int[] zahlenreihe = new int[10];

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < zahlenreihe.length; i++) {
            System.out.println("Gib eine Zahl ein für " + i);
            zahlenreihe[i] = scanner.nextInt();
            sum = sum + zahlenreihe[i];
        }

        System.out.println("Summe der o.g. Zahlen = " + sum);

    }
}
