package com.company;

public class TestCase {
    public static class TestParameters {
        double x;
        double y;
        Colour colour1;
        Colour colour2;

        TestParameters(double x, double y, Colour colour1, Colour colour2) {
            this.x = x;
            this.y = y;
            this.colour1 = colour1;
            this.colour2 = colour2;
        }

        public double getX() {
            return x;
        }

        public double getY() { return y;}

        public Colour getColour1() {
            return colour1;
        }

        public Colour getColour2() {
            return colour2;
        }
    }
}

