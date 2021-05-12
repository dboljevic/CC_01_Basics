package at.dbo.cc.schleifen;

import java.util.Random;
import java.util.Scanner;

// WHILE-Aufgabe Advanced  ***************************************************************************************
// Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert. Das Programm soll die Zufallszahlen zusammenzählen.
// Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

public class Uebungen2 {

    public static void main(String[] args) {


        // Mit if - elseIf  ***************************************************************************************

        Random random = new Random();
        boolean isFinished = false;

        int sum = 0;

        while (!isFinished) {
            int randomValue = random.nextInt(30 - 10 + 1) + 10;
            int abort1 = 15;
            int abort2 = 25;

            System.out.println("Zahl " + randomValue);
            sum = sum + randomValue;

            if (randomValue == abort1) {
                isFinished = true;
                sum -= abort1;
            } else if (randomValue == abort2) {
                isFinished = true;
                sum -= abort2;
            }
        }

        System.out.println("Die Summe der o.g. Zahlen ist: " + sum);

        // Mit switch ***************************************************************************************
        /*
        Random random = new Random();
        boolean isFinished = false;

        int sum = 0;

        while (!isFinished) {
            int randomValue = random.nextInt(21) + 10;      // Programm gibt mir ZZ zw. 0-20 aus, ich zähle +10 dazu damit ich auf die Werte 10-30 komme

            System.out.println("Zahl " + randomValue);
            sum = sum + randomValue;

            switch (randomValue){
                case 15: isFinished = true; sum -= 15; break;
                case 25: isFinished = true; sum -= 25; break;
            }
        }

        System.out.println("Die Summe der o.g. Zahlen ist: " + sum);
        */

        // Mit Switch ADVANCED ***************************************************************************************
        /*
        Random random = new Random();
        boolean isFinished = false;

        int sum = 0;

        while (!isFinished) {
            int randomValue = random.nextInt(21) + 10;

            switch(randomValue){
                case 15:
                case 25:
                    isFinished = true;
                    sum -= randomValue;
                    break;
            }

            System.out.println("Zahl " + randomValue);
            sum = sum + randomValue;

        }

        System.out.println("Die Summe der o.g. Zahlen ist: " + sum);
        */
    }
}
