package com.company;

public record Rectangle(double topLeftX, double topLeftY, double height, double width) {
    public boolean pointIsInto(double x, double y) {
        return (x >= topLeftX)
                && (x <= (topLeftX + width))
                && (y <= topLeftY)
                && (y >= (topLeftY - height));
    }

    public boolean pointIsOnLeft(double x) {
        return (x < topLeftX);
    }

}
