package com.company;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int invalidTest = CTests.invalidTest();

        if (invalidTest >= 0) {
            System.out.println("invalidTestNumber " + invalidTest);
            exit(invalidTest + 1); //программа завершается с кодом, который указан во входных параметрах
        } else {
            System.out.println("Please enter the coordinates of the point");
             double x = readDouble("x");
             double y = readDouble("y");

             printColour(x, y);
        }
    }

    static double readDouble(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(name + " = ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Re-enter the data.");
            System.out.print(name + " = ");
            scanner.next();
        }

        return scanner.nextDouble();
    }

    static void printColour(double x, double y) {
        System.out.println("(" + x + "; " + y + ") -> " + Picture_50.getColour(x, y));
    }
}
