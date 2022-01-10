package com.company;

public class Picture_50 {
    private final VerticalParabola parabola1;
    private final VerticalParabola parabola2;
    private final Rectangle rectangle1;
    private final Rectangle rectangle2;
    private final HorizontalParable parabola3;

    public Picture_50(VerticalParabola parabola1, VerticalParabola parabola2,
                      Rectangle rectangle1, Rectangle rectangle2, HorizontalParable parabola3) {
        this.parabola1 = parabola1;
        this.parabola2 = parabola2;
        this.rectangle1 = rectangle1;
        this.rectangle2 = rectangle2;
        this.parabola3 = parabola3;
    }

    public Colour getColour(double x, double y) {
        if (parabola2.pointIsAbove(x, y)) {
            return analysisAboveParabola2(x, y);
        } else return analysisBelowParabola2(x, y);
    }

    private Colour analysisAboveParabola2(double x, double y) {
        if (parabola1.pointIsAbove(x, y)) {
            if (rectangle1.pointIsInto(x, y))
                return Colour.Green;
            else return Colour.Orange;

        } else return analysisBelowParabola1(x, y);
    }

    private Colour analysisBelowParabola1(double x, double y) {
        if (rectangle1.pointIsInto(x, y))
            return Colour.White;
        else {
            if (rectangle1.pointIsOnLeft(x))
                return Colour.Blue;
            else return Colour.Yellow;
        }
    }

    private Colour analysisBelowParabola2(double x, double y) {
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
