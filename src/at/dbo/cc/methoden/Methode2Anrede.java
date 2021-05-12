package at.dbo.cc.methoden;

import java.util.Scanner;

/*Erstelle eine Methode die eine Anrede zurückliefert. Die Methode bekommt folgende Parameter

        String firstName

        String lastName

        boolean isMale

        Man kann der Methode also, einen Vornamen, einen Nachnamen und die Information ob es sich um eine Frau
        oder einen Mann handelt mitgeben. Die Methode liefert dann einen der folgenden Strings zurück:

        "Sehr geehrte Frau Susi Müller" oder "Sehr geehrter Herr Paul Müller". Je nachdem ob es eine weibliche oder männliche Person ist. Gib der Methode einen sinnvollen Namen.*/

public class Methode2Anrede {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vorname: ");
        String firstName = scanner.nextLine();

        System.out.print("Nachname: ");
        String lastName = scanner.nextLine();

        System.out.print("Geschlecht m/w : ");
        String sex = scanner.nextLine();

        System.out.println(getAnrede(firstName, lastName, "m".equals(sex)));


    }

    public static String getAnrede (String firstName, String lastName, boolean isMale) {
        if (isMale){
            return "Sehr geehrter Herr " + firstName + " " + lastName;
        } else {
            return "Sehr geehrte Frau " + firstName + " " + lastName;
        }
    }
}
