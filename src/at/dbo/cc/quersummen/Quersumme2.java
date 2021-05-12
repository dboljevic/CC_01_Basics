package at.dbo.cc.quersummen;

// Aufgabe: Gib alle Zahlen zwischen 0 und 1000 aus, bei welchen die Quersumme ein vielfaches von 7 ist.

public class Quersumme2 {

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            int zahl = i;
            int qs = 0;

            while (zahl > 0) {
                qs = qs + zahl % 10;
                zahl = zahl / 10;
            }

            if (qs % 7 == 0) {
                System.out.println(i + " = " + qs);
            }
        }
    }
}
