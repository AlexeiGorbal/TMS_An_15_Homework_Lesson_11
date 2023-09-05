package com.teachmeskills.lesson11.part2.model.figures;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String perimeterFigure() {
        return "The perimeter of the rectangle is: " + ((firstSide + secondSide) * 2);
    }
}
