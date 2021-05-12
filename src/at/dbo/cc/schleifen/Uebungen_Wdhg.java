package at.dbo.cc.schleifen;

import java.util.Scanner;

public class Uebungen_Wdhg {

    public static void main(String[] args) {

        // ********** Aufgabe 1 + 2 **********
        // Zähle die geraden Ziffern zwischen 1 und 1'000 zusammen

        // mit einer for loop **********
        /*
        int sum = 0;
        for (int i = 2; i <= 10; i = i+2) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);

        // mit einer while loop **********
        sum = 0;
        int z = 2;
        while (z > 0) {
            if (z < 11) {
                System.out.println(z);
                sum = sum + z;
                z = z + 2;
            } else {
                break;
            }
        }
        System.out.println(sum);*/


        // ********** Aufgabe 3 **********
        // Zähle von -400 bis 500. Wenn die  Zahl durch 5 teilbar ist, gib sie aus!

        /*for (int i = -400; i < 501 ; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }*/


        // ********** Aufgabe 4 **********
        // Erstelle einen While Loop. Bei jedem Schleifendurchgang muss der Benutzer eine Eingabe machen.
        // Sobald er "exit" eingibt erscheint "Das Programm wird beendet". Das Programm wird dann beendet!

        /*Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Hi. Bitte gib was ein. Mit exit beendest du das Programm.");

        while(!exit) {
            String text = scanner.nextLine();
            if (text.equals("exit")) {
                System.out.println("Danke, tschau");
                break;
            }
        }*/


        // ********** Aufgabe 5 **********
        // Erstelle einen While-Loop, der folgendermaßen herunterzählt: 1000 - 991 - 982 - 973 ...
        // Gib genau 15 Zahlen aus, dann beende den Loop

        /*int countdown = 1000;
        int fifteen = 0;

        while(countdown > 0) {
            System.out.println(countdown);
            countdown -= 9;

            fifteen++;

            if (fifteen == 15) {
                break;
            }
        }*/


        // ********** Aufgabe 6 **********
        // Schreibe ein Programm, das folgende Ausgabe erstellt. Erst 10 Sterne, dann 9, dann 8, etc.

        int starCounter = 10;
        String star = "*";

        while (starCounter > 0) {
            for (int i = starCounter; i > 0; i--) {
                System.out.print(star);
            }
            starCounter--;
            System.out.println();
        }

    }

}

