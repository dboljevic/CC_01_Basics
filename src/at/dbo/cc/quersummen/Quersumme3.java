package at.dbo.cc.quersummen;

// Aufgabe: Welche der Quersummen bei den Zahlen von 0 - 1000 kommt am häufigsten vor? Gib diese aus.

public class Quersumme3 {

    public static void main(String[] args) {

        int[] haeufigkeit = new int[28];

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

    }


/* Lösung Aleks

        public static void main(String[] args) {
            // Array mit 100 Eintraegen -> Quersumme > 100 wirds nicht geben
            Integer[] sums = new Integer[100];

            // Quersumme als Index hernehmen und an der Stelle inkrementieren
            for (int i = 0; i <= 1000; i++) {
                int sum = getQuersumme(i);
                if (sums[sum] == null) {
                    sums[sum] = 0;
                }
                sums[sum]++;
            }

            int maxCount = -1;
            int maxPosition = 0;
            // Die Stelle im Array suchen mit der hoechsten Anzahl
            for (int pos = 0; pos < sums.length; pos++) {
                if (sums[pos] != null && sums[pos] > maxCount) {
                    maxPosition = pos;
                    maxCount = sums[pos];
                }
            }

            System.out.println("Quersumme: " + maxPosition + " Anzahl:" + sums[maxPosition]);
        }

        public static int getQuersumme(int num) {
            String numAsString = "" + num;
            int result = 0;
            for (int i = 0; i < numAsString.length(); i++) {
                result += Integer.parseInt("" + numAsString.charAt(i));
            }
            return result;
        }
 */

}
