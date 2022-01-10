package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        final Picture_50 picture_50 = new Picture_50(new VerticalParabola(1, 6, 9),
                new VerticalParabola(0.5, 3, 1.5), new Rectangle(-2, 4, 9, 8),
                new Rectangle(2, 7, 5, 5), new HorizontalParable(0.12, 0.24, 3.12));

        int invalidTest = CTests.invalidTest(picture_50);

        if (invalidTest >= 0) {
            System.out.println("invalidTestNumber " + (invalidTest + 1));
        } else {
            System.out.println("Please enter the coordinates of the point");
            double x = readDouble("x");
            double y = readDouble("y");

            printColour(x, y, picture_50);
        }
    }

    private static double readDouble(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(name + " = ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Re-enter the data.");
            System.out.print(name + " = ");
            scanner.next();
        }

        return scanner.nextDouble();
    }

    private static void printColour(double x, double y, Picture_50 picture_50) {
        System.out.println("(" + x + "; " + y + ") -> " + picture_50.getColour(x, y));
    }
}
