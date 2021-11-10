package com.company;

public record HorizontalParable(double a, double b, double c) {
    public boolean pointIsOnRight(double x, double y) {
        return x >= (a * y + b) * y + c;
    }
}
