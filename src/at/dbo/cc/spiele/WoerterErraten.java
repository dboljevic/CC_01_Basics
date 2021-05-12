package at.dbo.cc.spiele;

/*

Schreibe ein Programm mit welchem man Wörter erraten kann. Für dies erstellst du ein
Array das du mit Wörtern befüllst. Zufällig wird je Spiel ein Wort daraus ausgewählt.
Die Ausgabe zum rätseln kann dann wie folgt aussehen: C***i** **m**s

Die Eingabe erfolgt wie nachstehend abgebildet:
"Welcher Buchstabe könnte im gesuchten Wort stecken?"
o
Co**i** **m**s

Sollte der Buchstabe “o” aus unserem Beispiel richtig sein, so wird der Stern an der
korrekten Stelle mit “o” ersetzt und das Wort neu ausgedruckt. Der Benutzer darf egal ob
richtig oder falsch weiter raten.

 */


import at.dbo.cc.util.ScannerHelper;

import java.util.Random;

public class WoerterErraten {

    public static void main(String[] args) {

        char[] word = getRandomWord().toCharArray();
        char[] pixelized = new char[word.length];
        char pixel = '*';
        for (int i = 0; i < word.length; i++) {
            pixelized[i] = pixel;
        }
        //System.out.println(word);
        System.out.println(pixelized);

        System.out.println("Welcher Buchstabe könnte im gesuchten Wort stecken?");

        while (!isFinished(pixelized)) {
            System.out.print("\nBuchstabe: ");
            char userInput = ScannerHelper.scannerText().toCharArray()[0];

            for (int i = 0; i < word.length; i++) {
                if (userInput == word[i]) {
                    pixelized[i] = userInput;
                }
            }
            depixelize(pixelized);
        }
        System.out.println("");
        System.out.println("Bravo ... :)))");
    }


    public static String getRandomWord() {
        String[] woerter = {"Hallo", "Test", "Fussball", "Volleyball", "Rennfahrer"};

        Random random = new Random();
        String randomWort = woerter[random.nextInt(woerter.length)];

        return randomWort;
    }


    public static void depixelize(char[] depixelizing) {
        for (int i = 0; i < depixelizing.length; i++) {
            System.out.print(depixelizing[i]);
        }
    }


    public static boolean isFinished(char[] unfinished) {
        for (int i = 0; i < unfinished.length; i++) {
            if (unfinished[i] == '*') {
                return false;
            }
        }
        return true;
    }
}
