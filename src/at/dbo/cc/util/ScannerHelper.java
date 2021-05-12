package at.dbo.cc.util;

import java.util.Scanner;

public class ScannerHelper {

    public static String scannerText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int scannerNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double scannerDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}

