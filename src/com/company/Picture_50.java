package com.company;

public class Picture_50 {
    static VerticalParabola parabola1 = new VerticalParabola(1, 6, 9);
    static VerticalParabola parabola2 = new VerticalParabola(0.5, 3, 1.5);
    static Rectangle rectangle1 = new Rectangle(-2, 4, 9, 8);
    static Rectangle rectangle2 = new Rectangle(2, 7, 5, 5);
    static HorizontalParable parabola3 = new HorizontalParable(0.12, 0.24, 3.12);

    public static Colour getColour(double x, double y) {
//разделяем на две основные области (выше/ниже параболы 2)
        if (parabola2.pointIsAbove(x, y)) {
            return analysisAboveParabola2(x, y);
        } else return analysisBelowParabola2(x, y);
    }

    public static Colour analysisAboveParabola2(double x, double y) {
        if (parabola1.pointIsAbove(x, y)) {
            if (rectangle1.pointIsInto(x, y))
                return Colour.Green;
            else return Colour.Orange;

        } else return analysisBelowParabola1(x, y);
    }

    static public Colour analysisBelowParabola1(double x, double y) {
        if (rectangle1.pointIsInto(x, y))
            return Colour.White;
        else {
            if (rectangle1.pointIsOnLeft(x))
                return Colour.Blue;
            else return Colour.Yellow;
        }
    }

    static public Colour analysisBelowParabola2(double x, double y) {
        if (parabola3.pointIsOnRight(x, y)
                && (!rectangle2.pointIsInto(x, y))
                && (!rectangle1.pointIsInto(x, y))) {
            return Colour.Orange;
        }

        if (parabola3.pointIsOnRight(x, y)
                && (rectangle2.pointIsInto(x, y))) {
            return Colour.White;
        }

        if ((rectangle2.pointIsInto(x, y))
                && (!parabola3.pointIsOnRight(x, y))) {
            if (rectangle1.pointIsInto(x, y))
                return Colour.Yellow;
            else return Colour.Blue;
        }

        if ((rectangle1.pointIsInto(x, y)) &&
                (!rectangle2.pointIsInto(x, y))) {
            return Colour.Gray;
        }

        return Colour.Green;
    }

}
