package at.dbo.cc.wuerfelspiel;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {

    public static void main(String[] args) {
        System.out.println("Hallo. Wie ist dein Name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hallo " + name + "! Willkommen zum Würfelspiel. Dein Gegner ist C3PO. \n" +
                "Jeder von euch hat 6 Würfe. Diese werden zusammengezählt und am Ende gewinnt der mit der höchst gewürfelten Punkteanzahl. \n" +
                "Alles klar? Mit x startet das Spiel, mit y beendest du es.");

        String choice = scanner.nextLine();

        switch (choice){
            case "x":
                game();
                break;
            case "y":
                System.out.println("Schade! Auf Wiedersehen.");
                break;
        }

    }

    public static void game(){
        Random random = new Random();

        System.out.println("Wunderbar! Los gehts");

        int sum = 0;

        int sumSpieler = getCubePoints(random, sum);
        System.out.println("Die Summe deiner Würfe beträgt: " + sumSpieler);
        // System.out.println("Die Summe der Würfe von " + name + "beträgt: " + sumSpieler);

        int sumCP30 = getCubePoints(random, sum);
        System.out.println("Die Summe der Würfe von C3PO beträgt: " + sumCP30);

        if (sumSpieler > sumCP30){
            System.out.println("Gratuliere! Du hast gewonnen :)");
        } else {
            System.out.println("Leider verloren. Versuch's nochmal.");
        }
    }

    public static int getCubePoints(Random random, int sum) {
        for (int i = 1; i < 7; i++) {
            int randomValue = random.nextInt(6) +1;
            String points = switch (randomValue) {
                case 1 -> "*";
                case 2 -> "**";
                case 3 -> "***";
                case 4 -> "****";
                case 5 -> "*****";
                case 6 -> "******";
                default -> "";
            };

            System.out.println("Wurf " + i + ": " + points  + " (" + randomValue + ")");

            sum = sum + randomValue;

        }
        return sum;
    }
}
