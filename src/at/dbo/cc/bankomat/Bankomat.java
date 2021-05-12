package at.dbo.cc.bankomat;

import java.util.Scanner;

/**Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:

 1. Einzahlen
 2. Abheben
 3. Kontostand
 4. Beenden*/


public class Bankomat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isFinished = false;

        int balance = 1_000;
        System.out.println("Hallo. Dein Kontostand beträgt " + balance + " EUR. Was möchtest du als nächstes tun:?");

        String payIn = "1. Einzahlen";
        String payOut = "2. Abheben";
        String balanceInfo = "3. Kontostand ansehen";
        String quit = "4. Beenden";

        System.out.println(payIn);
        System.out.println(payOut);
        System.out.println(balanceInfo);
        System.out.println(quit);

        while (!isFinished) {

            int selection = scan.nextInt();


            switch (selection) {

                case 1:
                    System.out.println("Wieviel möchtest du einzahlen?");
                    int input = scan.nextInt();
                    balance = balance + input;
                    System.out.println("Neuer Kontostand: " + balance + " EUR");
                    System.out.println("Benötigst du sonst noch was?");
                    break;

                case 2:
                    System.out.println("Wieviel möchtest du abheben?");
                    input = scan.nextInt();
                    balance = balance - input;
                    System.out.println("Neuer Kontostand: " + balance + " EUR");
                    System.out.println("Benötigst du sonst noch was?");
                    break;

                case 3:
                    System.out.println("Dein aktueller Kontostand beträgt " + balance + " EUR");
                    break;

                case 4:
                    System.out.println("Auf Wiedersehen!");
                    isFinished = true;
                    break;

                default:
                    System.out.println("Keine gültige Auswahl");
            }

        }

    }
}
