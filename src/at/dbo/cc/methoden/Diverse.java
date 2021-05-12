package at.dbo.cc.methoden;

import java.util.Scanner;

public class Diverse {

    // Aufgabe 1: Überprüfe ob eine Zahl eine Primzahl ist oder nicht
    /*
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Zahl ein, ich überprüfe ob es eine Primzahl ist oder nicht.");
        int x = scanner.nextInt();
        primzahl(x);
    }

    public static int primzahl (int x){
        if (x % 2 == 1 && x % 3 != 0){
            System.out.println("Die Zahl " + x + " ist eine Primzahl");
        } else {
            System.out.println("keine Primzahl");
        }
        return x;
    }
    */


    // Aufgabe 2: Überprüfe ob eine Zahl durch 3 teilbar ist
    /*
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Gib eine Zahl ein: ");
            int zahl = scanner.nextInt();

            isDurchDreiTeilbar(zahl);
        }
    }

    public static int isDurchDreiTeilbar (int zahl){
        if (zahl % 3 == 0){
            System.out.println("durch 3 teilbar");
        } else{
            System.out.println("nope");
        }
        return zahl;
    }
    */


    // Aufgabe 3: Eine Funktion, der ich 2 Werte mitgebe.
    // Die Funktion berechnet die Summe aller Zahlen die dazwischen liegen. (also z.B. input ist 3 und 8, das Ergebnis ist dann 3 + 4 + 5 + 6 + 7 + 8)

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        int x = scanner.nextInt();

        System.out.print("Zweite Zahl: ");
        int y = scanner.nextInt();

        System.out.println("---");

        System.out.println("Die Summe aller Zahlen dazwischen ist: " + resultBetweenThem(x, y));

    }

    public static int resultBetweenThem (int x, int y){

        int numbers = 0;
        for (int i = x; i <= y; i++) {
            System.out.println(i);
            numbers += i;
        }
        System.out.println("---");
        return numbers;
    }

}

