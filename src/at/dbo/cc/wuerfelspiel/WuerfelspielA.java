package at.dbo.cc.wuerfelspiel;

import java.util.Random;
import java.util.Scanner;

// Würfelspiel mit abwechselndem Würfeln

public class WuerfelspielA {

    public static void main (String[] args){

        System.out.println("Drücke x um zu würfeln. Anschließend würfelt der Computer. Die Punkte werden am Ende zusammengezählt.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String wuerfeln = scanner.nextLine();

        int playerPoints = 0;
        int pcPoints = 0;
        int randomValue = 0;

        // erster Wurf
        if (wuerfeln.equals("x")) {
            System.out.println("erster Wurf:");
            // Spieler würfelt
            randomValue = random.nextInt(6)+1;
            String points = getPointstoStars(randomValue);
            System.out.println("Du würfelst ... " + points + " (" + randomValue + ")");
            playerPoints = randomValue;

            // PC würfelt
            randomValue = random.nextInt(6)+1;
            points = getPointstoStars(randomValue);
            System.out.println("Der PC würfelt ... " + points + " (" + randomValue + ")");
            pcPoints = randomValue;
        }

        System.out.println("########## Zwischenstand ##########");
        System.out.println("Punkte Spieler: " + playerPoints);
        System.out.println("Punkte PC: " + pcPoints);

        // zweiter Wurf
        wuerfeln = scanner.nextLine();

        if (wuerfeln.equals("x")) {
            System.out.println("zweiter Wurf:");
            // Spieler würfelt
            randomValue = random.nextInt(6)+1;
            String points = getPointstoStars(randomValue);
            System.out.println("Du würfelst ... " + points + " (" + randomValue + ")");
            playerPoints = playerPoints + randomValue;

            // PC würfelt
            randomValue = random.nextInt(6)+1;
            points = getPointstoStars(randomValue);
            System.out.println("Der PC würfelt ... " + points + " (" + randomValue + ")");
            pcPoints = pcPoints + randomValue;
        }

        System.out.println("########## Zwischenstand ##########");
        System.out.println("Punkte Spieler: " + playerPoints);
        System.out.println("Punkte PC: " + pcPoints);

        // dritter Wurf
        wuerfeln = scanner.nextLine();

        if (wuerfeln.equals("x")) {
            System.out.println("dritter Wurf:");
            // Spieler würfelt
            randomValue = random.nextInt(6)+1;
            String points = getPointstoStars(randomValue);
            System.out.println("Du würfelst ... " + points + " (" + randomValue + ")");
            playerPoints = playerPoints + randomValue;

            // PC würfelt
            randomValue = random.nextInt(6)+1;
            points = getPointstoStars(randomValue);
            System.out.println("Der PC würfelt ... " + points + " (" + randomValue + ")");
            pcPoints = pcPoints + randomValue;
        }

        System.out.println("########## Zwischenstand ##########");
        System.out.println("Punkte Spieler: " + playerPoints);
        System.out.println("Punkte PC: " + pcPoints);

        // vierter Wurf
        wuerfeln = scanner.nextLine();

        if (wuerfeln.equals("x")) {
            System.out.println("vierter Wurf:");
            // Spieler würfelt
            randomValue = random.nextInt(6)+1;
            String points = getPointstoStars(randomValue);
            System.out.println("Du würfelst ... " + points + " (" + randomValue + ")");
            playerPoints = playerPoints + randomValue;

            // PC würfelt
            randomValue = random.nextInt(6)+1;
            points = getPointstoStars(randomValue);
            System.out.println("Der PC würfelt ... " + points + " (" + randomValue + ")");
            pcPoints = pcPoints + randomValue;
        }

        System.out.println("########## Zwischenstand ##########");
        System.out.println("Punkte Spieler: " + playerPoints);
        System.out.println("Punkte PC: " + pcPoints);

        // fünfter Wurf
        wuerfeln = scanner.nextLine();

        if (wuerfeln.equals("x")) {
            System.out.println("fünfter Wurf:");
            // Spieler würfelt
            randomValue = random.nextInt(6)+1;
            String points = getPointstoStars(randomValue);
            System.out.println("Du würfelst ... " + points + " (" + randomValue + ")");
            playerPoints = playerPoints + randomValue;

            // PC würfelt
            randomValue = random.nextInt(6)+1;
            points = getPointstoStars(randomValue);
            System.out.println("Der PC würfelt ... " + points + " (" + randomValue + ")");
            pcPoints = pcPoints + randomValue;
        }

        System.out.println("########## Zwischenstand ##########");
        System.out.println("Punkte Spieler: " + playerPoints);
        System.out.println("Punkte PC: " + pcPoints);

        // sechster Wurf
        wuerfeln = scanner.nextLine();

        if (wuerfeln.equals("x")) {
            System.out.println("letzter Wurf:");
            // Spieler würfelt
            randomValue = random.nextInt(6)+1;
            String points = getPointstoStars(randomValue);
            System.out.println("Du würfelst ... " + points + " (" + randomValue + ")");
            playerPoints = playerPoints + randomValue;

            // PC würfelt
            randomValue = random.nextInt(6)+1;
            points = getPointstoStars(randomValue);
            System.out.println("Der PC würfelt ... " + points + " (" + randomValue + ")");
            pcPoints = pcPoints + randomValue;
        }

        System.out.println("########## E N D E R G E B N I S ##########");
        System.out.println("Punkte Spieler: " + playerPoints);
        System.out.println("Punkte PC: " + pcPoints);

        if (playerPoints > pcPoints){
            System.out.println("Sieg!");
        } else if (playerPoints == pcPoints) {
            System.out.println("Unentschieden !!!");
        } else {
            System.out.println("Leider verloren. Versuch's nochmal.");
        }
    }

    public static String getPointstoStars(int randomValue) {
        return switch (randomValue) {
            case 1 -> "*";
            case 2 -> "**";
            case 3 -> "***";
            case 4 -> "****";
            case 5 -> "*****";
            case 6 -> "******";
            default -> "";
        };
    }

}
