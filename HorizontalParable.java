package com.company;

public record HorizontalParable(double a, double b, double c) {
    public boolean pointIsOnRight(Point point) {
        return point.x >= (a * point.y + b) * point.y + c;
    }
}
