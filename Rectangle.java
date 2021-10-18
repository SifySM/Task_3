package com.company;

public record Rectangle(Point topLeft, double height, double width) {
    public boolean pointIsInto(Point point) {
        return (point.x >= topLeft.x)
                && (point.x <= (topLeft.x + width))
                && (point.y <= topLeft.y)
                && (point.y >= (topLeft.y - height));
    }

    public boolean pointIsOnLeft(Point point) {
        return (point.x < topLeft.x);
    }

}
