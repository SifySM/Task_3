package com.company;

public class CTests {
    static TestCase.TestParameters[] testParameters = {
            new TestCase.TestParameters(-7, -7, Colour.Green, Colour.Green),
            new TestCase.TestParameters(1, -2, Colour.Gray, Colour.Gray),
            new TestCase.TestParameters(-3, 6, Colour.Orange, Colour.Orange),
            new TestCase.TestParameters(1, 7, Colour.Yellow, Colour.Yellow),
            new TestCase.TestParameters(-1, 2, Colour.White, Colour.White),
            new TestCase.TestParameters(-2, 4, Colour.Green, Colour.Orange),
            new TestCase.TestParameters(-3, -1, Colour.Blue, Colour.Blue),
            new TestCase.TestParameters(5, 6, Colour.Blue, Colour.Blue),
            new TestCase.TestParameters(9, 2, Colour.Orange, Colour.Orange),
            new TestCase.TestParameters(3, 3, Colour.Yellow, Colour.Yellow),
            new TestCase.TestParameters(6, -5, Colour.Gray, Colour.Orange),
            new TestCase.TestParameters(9, 9, Colour.Gray, Colour.Gray)
    };

    public static int invalidTest(Picture_50 picture_50) {
        for (int i = 0; i < testParameters.length; ++i) {
            Colour resColour = picture_50.getColour(testParameters[i].getX(), testParameters[i].getY());

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
