package at.dbo.cc.kalender;

import java.util.Random;
import java.util.Scanner;

// Aufgabe: einen Kalender korrekt darstellen
// Code mit Methoden verschönert

public class KalenderUpdated {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalenderdarstellung: Welcher Monat? 1 - 12");

        while (true) {

            int days = getMonth(scanner);

            for (int i = 0; i < 7; i++) {
                String[] wochentage = {" | Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
                System.out.print(wochentage[i] + " | ");
            }
            System.out.println("");

            Random random = new Random();
            int startingDay = random.nextInt(5);

            for (int i = 1; i <= days; i++) {
                System.out.print(" | ");
                if (startingDay>=1){
                    for (int sd = 1; sd <= startingDay ; sd++) {
                        System.out.print("   | ");
                    }
                }
                while (i<=7-startingDay){
                    System.out.print(" " + i + " | ");
                    i++;
                } System.out.println("");
                System.out.print(" | ");
                while (i<=9){
                    System.out.print(" " + i + " | ");
                    i++;
                }
                while (i<=14-startingDay){
                    System.out.print(i + " | ");
                    i++;
                } System.out.println("");
                System.out.print(" | ");
                while (i<=21-startingDay){
                    System.out.print(i + " | ");
                    i++;
                } System.out.println("");
                System.out.print(" | ");
                while (i<=28-startingDay){
                    System.out.print(i + " | ");
                    i++;
                } System.out.println("");
                System.out.print(" | ");
                while (i<=days){
                    System.out.print(i + " | ");
                    i++;
                } System.out.println("");
            }

        }
    }

    private static int getMonth(Scanner scanner) {
        int getMonat = scanner.nextInt();
        String[] monat = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        int tageAnzahl;

        switch (getMonat) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tageAnzahl = 31;
                break;

            case 2:
                tageAnzahl = 28;
                break;

            default:
                tageAnzahl = 30;
                break;

        }

        System.out.println(monat[getMonat - 1]);
        return tageAnzahl;
    }
}



