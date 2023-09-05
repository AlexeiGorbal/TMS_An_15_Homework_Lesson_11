package com.teachmeskills.lesson11.part2.model.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String perimeterFigure() {
        return "The perimeter of the circle is: " + (2 * 3.14 * radius);
    }
}
