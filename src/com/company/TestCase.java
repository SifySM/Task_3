package com.company;

public class TestCase {
    static public class TestParameters {
        //параметры для одного теста
        Point point;
        Colour colour1;
        Colour colour2;

        public TestParameters(Point point, Colour colour1, Colour colour2) {
            this.point = point;
            this.colour1 = colour1;
            this.colour2 = colour2;
        }

        public Point getPoint() {
            return point;
        }

        public Colour getColour1() {
            return colour1;
        }

        public Colour getColour2() {
            return colour2;
        }
    }

    static TestParameters[] testParameters = {
            new TestParameters(new Point(-7, -7), Colour.Green, Colour.Green),
            new TestParameters(new Point(1, -2), Colour.Gray, Colour.Gray),
            new TestParameters(new Point(-3, 6), Colour.Orange, Colour.Orange),
            new TestParameters(new Point(1, 7), Colour.Yellow, Colour.Yellow),
            new TestParameters(new Point(-1, 2), Colour.White, Colour.White),
            new TestParameters(new Point(-2, 4), Colour.Green, Colour.Orange),
            new TestParameters(new Point(-3, -1), Colour.Blue, Colour.Blue),
            new TestParameters(new Point(5, 6), Colour.Blue, Colour.Blue),
            new TestParameters(new Point(9, 2), Colour.Orange, Colour.Orange),
            new TestParameters(new Point(3, 3), Colour.Yellow, Colour.Yellow),
            new TestParameters(new Point(6, -5), Colour.Gray, Colour.Orange),
            new TestParameters(new Point(9, 9), Colour.Green, Colour.Green)
    };

    public static int invalidTest() {
        for (int i = 0; i < testParameters.length; ++i) {
            Colour resColour = Picture_50.getColour(testParameters[i].getPoint());
            if ((resColour != testParameters[i].getColour1()) && (resColour != testParameters[i].getColour2())) {
                return i;
            }
        }
        return -1;
    }
}

