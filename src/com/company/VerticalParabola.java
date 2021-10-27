package com.company;

public record VerticalParabola(double a, double b, double c) {
    public boolean pointIsAbove(Point point) {
        return point.y >= (a * point.x + b) * point.x + c;
    }
}
