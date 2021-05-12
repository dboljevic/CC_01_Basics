package at.dbo.cc.methoden;

import java.util.Scanner;

public class Methode_1_Calculations {

    public static void main(String[] args) {

        System.out.println("Daniel's easy cheesy Methoden Rechner:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl 1: ");
        double a = scanner.nextInt();
        System.out.print("Zahl 2: ");
        double b = scanner.nextInt();

        double resultAdd = add(a, b);
        System.out.print("Addition = ");
        System.out.println(resultAdd);

        double resultSub = sub(a, b);
        System.out.print("Subtraktion = ");
        System.out.println(resultSub);

        double resultMul = mul(a, b);
        System.out.print("Multiplikation = ");
        System.out.println(resultMul);

        double resultDiv = div(a, b);
        System.out.print("Division = ");
        System.out.println(resultDiv);
    }

    public static double add (double a, double b){
        double addition = a + b;
        return addition;
    }

    public static double sub (double a, double b){
        double subtraction = a - b;
        return subtraction;
    }

    public static double mul (double a, double b){
        double multiplication = a * b;
        return multiplication;
    }

    public static double div (double a, double b){
        double division = a / b;
        return division;
    }
}
