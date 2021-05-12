package at.dbo.cc;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        System.out.println("Hallo Coding Campus - 01.03.2021");



        // ****************** Aufgabe 1: Variablen & Operationen 1 ******************

        // Erstelle eine Variable amount vom Typ int. Weise ihr den Wert 10 zu
        int amount = 10;

        // Erstelle eine Variable size. Weise ihr den Wert der Variable amount zu
        int size = amount;

        // Multipliziere beide Variablen miteinander - Weise das Ergebnis der neuen Variable result zu
        int result = amount * size;

        // Gib das Ergebnis hier aus
        System.out.println(result);




        // ****************** Aufgabe 2: Variablen & Operationen 2 ******************

        // Erstelle eine Variable banana mit dem Wert "Banane"
        String banana = "Banane";

        // Erstelle eine Variable apple mit dem Wert "Apple"
        String apple = "Apple";

        // Erstelle eine Variable bananaPricePerKilo mit dem Wert 2.14
        double bananaPricePerKilo = 2.14;

        // Erstelle eine Variable applePricePerKilo mit dem Wert 3.43
        double applePricePerKilo = 3.43;

        // Ein Apfel hat durchschnittlich ein Gewicht von 0.34 Kilo
        double appleWeightAverage = 0.34;

        // Eine Banane hat durchschnittlich ein Gewicht von 0.22 Kilo
        double bananaWeightAverage = 0.22;

        // Gib folgendes aus: Anzahl Bananen/Äpfel pro Kilo, Preis pro Banane/Apfel
        double pcsPERkgA = 1 / appleWeightAverage;
        double pcsPERkgB = 1 / bananaWeightAverage;
        double pricePerA = applePricePerKilo * appleWeightAverage;
        double pricePerB = bananaPricePerKilo * bananaWeightAverage;

        System.out.println("Anzahl der Äpfel pro Kilo beträgt: " + pcsPERkgA);
        System.out.println("Preis pro Apfel beträgt: EUR " + pricePerA);
        System.out.println("Anzahl der Bananen pro Kilo beträgt: " + pcsPERkgB);
        System.out.println("Preis pro Banane beträgt: EUR " + pricePerB);


        // Preis von x Äpfeln
        System.out.println("Gib mir den Preis für x Äpfel:");    // wir unterbrechen kurz das Programm um eine Eingabe einzufordern
        Scanner scan = new Scanner(System.in);                   // Scanner = Eingabe in die Konsole
        int inputNumber = scan.nextInt();
        System.out.println("Preis für " + inputNumber + " Äpfel beträgt: EUR " + pricePerA * inputNumber);


        // Preis von 17 Bananen
        System.out.println("Gib mir den Preis für x Bananen:");
        inputNumber = scan.nextInt();                               // hier überschreiben wir die Eingabe von oben bzw. weisen der Eingabe einen neuen Wert zu
        System.out.println("Preis für " + inputNumber + " Bananen beträgt: EUR " + pricePerB * inputNumber);

        // Preis von 1 Tonne Äpfel
        System.out.println("Preis für 1 Tonne Äpfel beträgt: EUR " + applePricePerKilo * 1000);

        // Preis von 1 Tonne Bananen
        System.out.println("Preis für 1 Tonne Bananen beträgt: EUR " + bananaPricePerKilo * 1000);


    }


}
