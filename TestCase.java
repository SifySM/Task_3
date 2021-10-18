package com.company;

public class TestCase {
    static public class TestParameters {
        Point point;
        Picture_50.Colour colour1;
        Picture_50.Colour colour2;

        public TestParameters(Point point, Picture_50.Colour colour1, Picture_50.Colour colour2) {
            this.point = point;
            this.colour1 = colour1;
            this.colour2 = colour2;
        }

        public Point getPoint() {
            return point;
        }

        public Picture_50.Colour getColour1() {
            return colour1;
        }

        public Picture_50.Colour getColour2() {
            return colour2;
        }
    }

    static TestParameters[] testParameters = {
            new TestParameters(new Point(-7, -7), Picture_50.Colour.Green, Picture_50.Colour.Green),
            new TestParameters(new Point(1, -2), Picture_50.Colour.Gray, Picture_50.Colour.Gray),
            new TestParameters(new Point(-3, 6), Picture_50.Colour.Orange, Picture_50.Colour.Orange),
            new TestParameters(new Point(1, 7), Picture_50.Colour.Yellow, Picture_50.Colour.Yellow),
            new TestParameters(new Point(-1, 2), Picture_50.Colour.White, Picture_50.Colour.White),
            new TestParameters(new Point(-2, 4), Picture_50.Colour.Green, Picture_50.Colour.Orange),
            new TestParameters(new Point(-3, -1), Picture_50.Colour.Blue, Picture_50.Colour.Blue),
            new TestParameters(new Point(5, 6), Picture_50.Colour.Blue, Picture_50.Colour.Blue),
            new TestParameters(new Point(9, 2), Picture_50.Colour.Orange, Picture_50.Colour.Orange),
            new TestParameters(new Point(3, 3), Picture_50.Colour.Yellow, Picture_50.Colour.Yellow),
            new TestParameters(new Point(6, -5), Picture_50.Colour.Gray, Picture_50.Colour.Orange),
            new TestParameters(new Point(9, 9), Picture_50.Colour.Green, Picture_50.Colour.Green)
    };

    public static int invalidTest() {
        for (int i = 0; i < testParameters.length; ++i) {
            Picture_50.Colour resColour = Picture_50.getColour(testParameters[i].getPoint());
            if ((resColour != testParameters[i].getColour1()) && (resColour != testParameters[i].getColour2())) {
                return i;
            }
        }
        return -1;
    }
}

