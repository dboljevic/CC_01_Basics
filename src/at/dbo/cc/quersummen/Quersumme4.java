package at.dbo.cc.quersummen;

import java.util.Scanner;

// Die iterierte Quersumme wird auch Ziffernwurzel genannt (Bsp.: 47 --> 11 --> 2)
// Aufgabe: Der Benutzer soll eine Zahl eingeben können. Dein Programm berechnet dann die oben beschriebene Ziffernwurzel.

public class Quersumme4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo! Bitte geben Sie eine Zahl ein um die iterierte Quersumme zu berechnen:");

        while (true) {
            int zahl = scanner.nextInt();
            int qs = 0;

            while (zahl > 0) {
                qs = qs + zahl % 10;
                zahl = zahl / 10;
            }
            System.out.println("Die Quersumme beträgt " + qs);

            if (qs >= 10) {
                int iqs = 0;
                while (qs > 0) {
                    iqs = iqs + qs % 10;
                    qs = qs / 10;
                }
                System.out.println("Die iterierte Quersumme beträgt " + iqs);
            } else {
                System.out.println("Bei dieser Zahl gibt es keine iterierte Quersumme.");
            }
        }
    }
}
