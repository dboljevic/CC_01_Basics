package at.dbo.cc.schleifen;

import java.util.Random;
import java.util.Scanner;

/* *******  Aufgabe Personen im Lift *********************************************************************************************
        Erstelle ein Zahlenarray dass das Gewicht von Personen in einem Aufzug beinhaltet. Mit Hilfe einer
        Schleife werden die einzelnen Werte addiert, sollte das maximal zulässige Gesamtgewicht von 350 kg
        überschritten werden, so wird ausgegeben das der Aufzug überlastet ist und die Schleife beendet sich. */

public class Uebungen_Lift {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isFull = false;

        int weightMax = 350;
        System.out.println("Willkommen im Lift. Das höchst zugelassene Gewicht beträgt " + weightMax + " kg");

        int persons = 0;

        while (!isFull) {

            System.out.println("Bitte geben Sie Ihr Gewicht an: ");
            int weight = scan.nextInt();

            weightMax -= weight;

            if (weightMax <= 0) {
                isFull = true;
                System.out.println("Sorry, Sie sind zu schwer. Bitte nicht einsteigen - der Lift fährt nun ohne Sie.");
                System.out.println("Personen im Lift: " + persons);
                break;
            } else {
                System.out.println(weightMax + " kg Last noch möglich");
            }

            persons += 1;
        }
    }
}
