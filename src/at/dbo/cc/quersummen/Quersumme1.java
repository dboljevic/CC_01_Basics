package at.dbo.cc.quersummen;

// Aufgabe 1: Gib alle Zahlen zwischen 0 und 1000 aus, welche eine Quersumme von 15 haben.

public class Quersumme1 {

    public static void main(String[] args) {

// QS berechnen per Modulo **************************
        /*int zahl = 123;
        int qs = 0;
        while (zahl > 0) {
            qs = qs + zahl % 10;
            zahl = zahl / 10;
        }
        System.out.println("Quersumme " + qs); = 6*/


// QS berechnen per String **************************
        /*int number = 123;

        String numberAsString = Integer.toString(number);
        char[] numbers = numberAsString.toCharArray();

        int sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            sum = sum + Character.getNumericValue(numbers[i]);
        }

        System.out.println(sum);*/


        for (int i = 1; i < 1000; i++) {
            int zahl = i;
            int qs = 0;

            while (zahl > 0) {
                qs = qs + zahl % 10;
                zahl = zahl / 10;
            }

            if (qs == 15) {
                System.out.println(i + " = " + qs);
            }
        }




    }



}
