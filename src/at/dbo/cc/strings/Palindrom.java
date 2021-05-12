package at.dbo.cc.strings;

import at.dbo.cc.util.ScannerHelper;

/*

Erstelle ein Programm das erkennt, ob es sich bei einem beliebigen Wort um ein Palindrom handelt.

Eingabe: “RENTNER”
Ergebnis: true

Eingabe: “Peter”
Ergebnis: false

Signatur der Funktion:
public static boolean isPalindrom(String word)

 */

public class Palindrom {

    public static void main(String[] args){

        String palindromChecking = ScannerHelper.scannerText();
        boolean checked = isPalindrom(palindromChecking);
        System.out.println(checked);

    }

    public static boolean isPalindrom (String palindromChecking){
        Umkehrung.getReverseString(palindromChecking);                                  // hier greife ich auf meine Umkehrung-Klasse von zuvor zu
        String reversed = Umkehrung.getReverseString(palindromChecking);
        if (palindromChecking.equalsIgnoreCase(reversed)) {                             // IgnoreCase ignoriert die Groß- bzw. Kleinschreibung
            return true;
        }
        return false;
    }


}
