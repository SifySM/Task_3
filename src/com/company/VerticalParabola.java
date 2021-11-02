package com.company;

public record VerticalParabola(double a, double b, double c) {
    public boolean pointIsAbove(double x, double y) {
        return y >= (a * x + b) * x + c;
    }
}
