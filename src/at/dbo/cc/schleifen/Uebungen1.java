package at.dbo.cc.schleifen;

import at.dbo.cc.util.ScannerHelper;

import java.util.Random;


public class Uebungen1 {

    public static void main(String[] args) {

         // Beispiel FOR: zähle die Ziffern zwischen 1 und 100 zusammen  ***************************************************************************************

        int sum = 0;
        for (int a = 0; a <= 100; a++) {
            sum = sum + a;
        }
        System.out.println("Summe aller geraden Ziffern zw. 1 und 100 ist " + sum);

        int i = ScannerHelper.scannerNumber();
        System.out.println(i);


        // Beispiel FOR: zähle die geraden Ziffern zwischen 1 und 1000 zusammen  ***************************************************************************************

        int sumEven = 0;
        for (int a = 0; a <= 1000; a = a + 2) {
            sumEven = sumEven + a;
        }
        System.out.println("Summe aller geraden Ziffern zw. 1 und 1000 ist " + sumEven);



       // WHILE-Aufgabe: coaching   ***************************************************************************************
        // Erstelle ein Programm, dass Zufallszahlen zwischen 1 und 100 generiert. Sobald eine Zahl >90 kommt, wird das Programm beendet!

        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished) {
            int randomValue = random.nextInt(100);
            System.out.println("Nr. " + randomValue);

            if (randomValue > 90) {
                isFinished = true;
            }
        }
    }
}
