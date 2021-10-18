package com.company;

public class Picture_50 {
    static VerticalParabola parabola1 = new VerticalParabola(1, 6, 9);
    static VerticalParabola parabola2 = new VerticalParabola(0.5, 3, 1.5);
    static Rectangle rectangle1 = new Rectangle(new Point(-2, 4), 9, 8);
    static Rectangle rectangle2 = new Rectangle(new Point(2, 7), 5, 5);
    static HorizontalParable parabola3 = new HorizontalParable(0.12, 0.24, 3.12);

    public enum Colour {
        White,
        Gray,
        Yellow,
        Orange,
        Blue,
        Green
    }

    static public Colour getColour(Point point) {
//разделяем на две основные области (выше/ниже параболы 2)
        if (parabola2.pointIsAbove(point)) {
            return analysisAboveParabola2(point);
        } else return analysisBelowParabola2(point);
    }

    static public Colour analysisAboveParabola2(Point point) {
        if (parabola1.pointIsAbove(point)) {
            if (rectangle1.pointIsInto(point))
                return Colour.Green;
            else return Colour.Orange;

        } else return analysisBelowParabola1(point);
    }

    static public Colour analysisBelowParabola1(Point point) {
        if (rectangle1.pointIsInto(point))
            return Colour.White;
        else {
            if (rectangle1.pointIsOnLeft(point))
                return Colour.Blue;
            else return Colour.Yellow;
        }
    }

    static public Colour analysisBelowParabola2(Point point) {
        if (parabola3.pointIsOnRight(point)
                && (!rectangle2.pointIsInto(point))
                && (!rectangle1.pointIsInto(point))) {
            return Colour.Orange;
        }

        if (parabola3.pointIsOnRight(point)
                && (rectangle2.pointIsInto(point))) {
            return Colour.White;
        }

        if ((rectangle2.pointIsInto(point))
                && (!parabola3.pointIsOnRight(point))) {
            if (rectangle1.pointIsInto(point))
                return Colour.Yellow;
            else return Colour.Blue;
        }

        if ((rectangle1.pointIsInto(point)) &&
                (!rectangle2.pointIsInto(point))) {
            return Colour.Gray;
        }

        return Colour.Green;
    }

}
