package com.company;

public class TestCase {
    static public class TestParameters {
        //параметры для одного теста
        double x;
        double y;
        Colour colour1;
        Colour colour2;

        public TestParameters(double x, double y, Colour colour1, Colour colour2) {
            this.x = x;
            this.y = y;
            this.colour1 = colour1;
            this.colour2 = colour2;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Colour getColour1() {
            return colour1;
        }

        public Colour getColour2() {
            return colour2;
        }
    }

    static TestParameters[] testParameters = {
            new TestParameters(-7, -7, Colour.Green, Colour.Green),
            new TestParameters(1, -2, Colour.Gray, Colour.Gray),
            new TestParameters(-3, 6, Colour.Orange, Colour.Orange),
            new TestParameters(1, 7, Colour.Yellow, Colour.Yellow),
            new TestParameters(-1, 2, Colour.White, Colour.White),
            new TestParameters(-2, 4, Colour.Green, Colour.Orange),
            new TestParameters(-3, -1, Colour.Blue, Colour.Blue),
            new TestParameters(5, 6, Colour.Blue, Colour.Blue),
            new TestParameters(9, 2, Colour.Orange, Colour.Orange),
            new TestParameters(3, 3, Colour.Yellow, Colour.Yellow),
            new TestParameters(6, -5, Colour.Gray, Colour.Orange),
            new TestParameters(9, 9, Colour.Green, Colour.Green)
    };

    public static int invalidTest() {
        for (int i = 0; i < testParameters.length; ++i) {
            Colour resColour = Picture_50.getColour(testParameters[i].getX(), testParameters[i].getY());

            printColour(testParameters[i].getX(), testParameters[i].getY(), resColour);

            if ((resColour != testParameters[i].getColour1()) && (resColour != testParameters[i].getColour2())) {
                return i;
            }
        }
        return -1;
    }

    static void printColour(double x, double y, Colour resColour) {
        System.out.println("(" + x + "; " + y + ") -> " + resColour);
    }
}

