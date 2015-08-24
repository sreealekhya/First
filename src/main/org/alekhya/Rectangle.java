package org.alekhya;

public class Rectangle {

    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public double calArea() {
        return length*breadth;
    }

    public double calPerimeter() {
        return 2*(length+breadth);
    }
}
