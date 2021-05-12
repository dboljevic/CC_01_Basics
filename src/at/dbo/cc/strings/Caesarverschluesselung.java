package at.dbo.cc.strings;

import java.util.Scanner;

/*

Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen im Alphabet verschoben (z.B. 2 Stellen) a wird zu c, f wird zu h, z wird zu b usw.

"hans" wird also zu "jcpu"

Achtung: z wird zu b

Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String

Decrypt entschlüsselt das Wort wieder. Aus "jcpu" wird dann wieder "hans".

Erweiterung: Baue die Methoden so um, dass man die Anzahl der Stellen um die verschoben werden soll (also z.B. 2 Stellen) eingeben kann

 */

public class Caesarverschluesselung {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Willkommen bei dbo's Cäserverschlüsselung. \nGib ein Wort ein und siehe was passiert: ");

        String zuVerschluesseln = scan.nextLine();
        System.out.println("Verschlüsselt: " + encrypt(zuVerschluesseln));


        System.out.print("Und jetzt gebe ein bereits verschlüsseltes Wort, um es wieder umzuwandeln: ");

        String zuEntschluesseln = scan.nextLine();
        System.out.println("Entschlüsselt: " + decrypt(zuEntschluesseln));

    }


    public static String encrypt (String zuVerschluesseln){
        char[] e = zuVerschluesseln.toCharArray();
        for (int i = 0; i < e.length; i++) {
            e[i] +=2;
            }
        String caesar = new String(e);
        return caesar;
    }


    public static String decrypt (String zuEntschluesseln){
        char[] d = zuEntschluesseln.toCharArray();
        for (int i = 0; i < d.length; i++) {
            d[i] -=2;
        }
        String caesar1 = new String(d);
        return caesar1;
    }
}



/* Erweiterung: Baue die Methoden so um, dass man die Anzahl der Stellen um die verschoben werden soll (also z.B. 2 Stellen) eingeben kann

Baue eine Eingabe ein ...
    int verschiebe = scan.nextInt();

Verwende diese in der Schleife um die ausgewählte Zahl zu addieren
    caesar[i] += verschiebe;

 */





/*  ZUR INFO:
Bei dieser Variante wird die Eingabe direkt in die for-Schleife übernommen. Problem ist jedoch, dass hier keine Methode
gemacht werden kann, da es keinen Rückgabewert gibt


            for (int i = 0; i < zuVerschluesseln.length(); i++) {
            char caesar = zuVerschluesseln.charAt(i);
            caesar +=2;
            System.out.print(caesar);
        }
        */