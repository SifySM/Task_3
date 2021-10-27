package com.company;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int invalidTest = TestCase.invalidTest();

        if (invalidTest >= 0) {
            System.out.println("invalidTestNumber " + invalidTest);
            exit(invalidTest + 1); //программа завершается с кодом, который указан во входных параметрах
        } else {
            Scanner scanner = new Scanner(System.in);
            Point point = new Point();
            System.out.println("Please enter the coordinates of the point");
            System.out.print("x: ");
            point.x = scanner.nextDouble();
            System.out.print("y: ");
            point.y = scanner.nextDouble();
            System.out.println("The point is located in the color area: " + Picture_50.getColour(point));
        }
    }


}
