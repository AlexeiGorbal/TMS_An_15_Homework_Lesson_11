package com.teachmeskills.lesson11.part2.model.figures;

public class Triangle extends Figure {
    private double firstSide, secondSide, thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public String perimeterFigure() {
        return "The perimeter of the triangle is: " + (firstSide + secondSide + thirdSide);
    }
}
