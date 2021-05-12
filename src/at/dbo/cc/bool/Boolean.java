package at.dbo.cc.bool;

public class Boolean {

    public static void main(String[] args) {

        // gibt die Werte true oder false aus
        // MERKE: beginne den Variablennamen mit einem Fragewort wie "is" oder "has" ... Bsp: isAge = 18

        // Im Sommer haben wir Durst und wollen nicht, dass das Bier ausgeht :)



        int i = 10;

        while (i >= 3) {
            System.out.println("Noch " + i + " Bier........ Alles gut :)"); i--;
        }

        if (i < 3) {
            System.out.println("Geh Bier kaufen !!!!");
        }



        int bottlesOfBeer = 10;
        boolean isFridgeFull = bottlesOfBeer >= 3;

        while (isFridgeFull) {
            System.out.println("Noch " + bottlesOfBeer + "Bier"); bottlesOfBeer--;
            isFridgeFull = bottlesOfBeer >= 3;
        }


 /*// ******* Aufgabe zu booleschen Ausdrücken **********************************************************************************************

        // Aufgabe 1: Der Fahrer darf das  Motorrad fahren, wenn er 24 Jahre oder älter ist oder den
        // Motorradführerschein besitzt aber nicht mehr in der Probezeit ist.

        int alter = 18;
        int alterErreicht = 24;
        boolean isOldEnough = alter >= alterErreicht;
        boolean hasADrivingLicence = false;

        if (isOldEnough || hasADrivingLicence) {
            System.out.println("Gratuliere");
        } else {
            while (alter < alterErreicht) {
                System.out.println("Warte noch ein Jahr.");
                alter++;
            }
            System.out.println("Endlich geschafft, 24... hier dein Motorrad");

        }*/

    }
}
