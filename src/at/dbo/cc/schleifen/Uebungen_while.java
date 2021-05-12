package at.dbo.cc.schleifen;

import java.util.Random;
import java.util.Scanner;

public class Uebungen_while {

    public static void main(String[] args) {

        // Beispiel WHILE: erstelle mit * einen Pfeil  ***************************************************************************************

        int i = 1;
        String x = "*";

        while (i <= 5) {
            System.out.println(x.repeat(i));
            i++;
        }

        while (i >= 1) {
            System.out.println(x.repeat(i));
            i--;
        }


//TODO Beispiel WHILE: erstelle mit * einen Tannenbaum  ***************************************************************************************

        int t = 1;
        String y = "*";

        while (t <= 5) {
            System.out.println(y.repeat(t));
            t++;
        }



    }



}
