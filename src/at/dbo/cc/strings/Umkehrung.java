package at.dbo.cc.strings;

/*
Erstelle eine Funktion die Worte umdreht.

Eingabe: katze --> Ergebnis: eztak

Signatur der Funktion:
public static String getReverseString(String text)
 */

import at.dbo.cc.util.ScannerHelper;

public class Umkehrung {

    public static void main(String[] args){

        String text = ScannerHelper.scannerText();
        String reversed = getReverseString(text);
        /*reversed = Caesarverschluesselung.encrypt(reversed);
        reversed = Caesarverschluesselung.decrypt(reversed);
        reversed = getReverseString(reversed);*/
        System.out.println(reversed);

    }

    public static String getReverseString (String text){
        char[] c = text.toCharArray();
        char[] r = new char[c.length];
        for (int i = 0; i < c.length; i++) {                           // Achtung: hier bei length -1 angeben, da sonst der Fehler OutOfBounds kommt! Weil das erste Zeichen Index 0 hat ...
            r[i] = c[c.length-1-i];
        }
        String reverse = new String(r);
        return reverse;

    }
}
