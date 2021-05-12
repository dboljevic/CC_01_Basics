package at.dbo.cc.ifabfragen;

import java.util.Random;

public class IfAbfragen {
    public static void main(String[] args) {


        // ****************** Aufgabe 1 ******************

        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"


        if (randomNumber < 20) {
            System.out.println("Mini");
        } else if (randomNumber >= 20 && randomNumber <= 50) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }


        // ****************** Aufgabe 2 ******************

        // Erstelle zwei Zufallszahl zwischen 0 und 100
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        System.out.println(randomNumber1 + " und " + randomNumber2);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50, dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
        if (randomNumber1 < randomNumber2 && randomNumber1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30, dann gib aus "Eine der beiden ist kleiner als 30"
        if (randomNumber1 < 30 || randomNumber2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist, dann gib aus "Erste Zahl klein, zweite kein 50iger"
        if ((randomNumber1 < 50) && (randomNumber2 != 50)) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }


        // ****************** Aufgabe 3 - switch ******************

        // Erstelle eine Zufallszahl zwischen 5 und 10
        int zufallszahl = random.nextInt(10 - 5 + 1) + 5;
        System.out.print(zufallszahl + " = ");

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.


        switch(zufallszahl) {
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }

        // Kurzform switch
        switch (zufallszahl) {
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
        }

    }

}
