package at.dbo.cc.util;

public class StringHelper {


    public static boolean isPalindrom(String text) {

        char[] c = text.toCharArray();
        char[] r = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            r[i] = c[c.length - 1 - i];
        }
        String reversed = new String(r);

        if (text.equalsIgnoreCase(reversed)) {
            return true;
        }
        return false;
    }


    public static String getReverseString(String text) {
        char[] c = text.toCharArray();
        char[] r = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            r[i] = c[c.length - 1 - i];
        }
        String reversed = new String(r);
        return reversed;

    }


    /*public static int countLetters (String, char){
        int[] haeufigkeit = new int[130];

        for (int i = 1; i < 1000; i++) {

            int zahl = i;
            int qs = 0;

            while (zahl > 0) {
                qs = qs + zahl % 10;
                zahl = zahl / 10;
            }
            System.out.println(i + " = Quersumme " + qs);

            haeufigkeit[qs] += 1;
        }

        int maxIndex = 0;
        int maxValue = 0;

        for (int i = 0; i < haeufigkeit.length; i++) {
            if (haeufigkeit[i]>maxValue){
                maxValue = haeufigkeit[i];
                maxIndex = i;
            }
        }

        // Prüft, welche Zahlen die häufigsten Quersummen haben
        for (int i = 0; i < haeufigkeit.length; i++) {
            if(haeufigkeit[i]==maxValue){
                System.out.println(i);
            }
        }

        System.out.println("Die Quersumme " + maxIndex + " kommt " + maxValue + " mal vor");

    }*/


}
