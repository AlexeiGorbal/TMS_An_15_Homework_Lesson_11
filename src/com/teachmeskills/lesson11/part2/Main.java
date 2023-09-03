package com.teachmeskills.lesson11.part2;

import com.teachmeskills.lesson11.part2.model.Figures.Circle;
import com.teachmeskills.lesson11.part2.model.Figures.Figure;
import com.teachmeskills.lesson11.part2.model.Figures.Rectangle;
import com.teachmeskills.lesson11.part2.model.Figures.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Circle(12);
        Figure figure2 = new Triangle(3, 6, 9);
        Figure figure3 = new Rectangle(2, 5);

        ArrayList<Figure> arrayList = new ArrayList<>();

        arrayList.add(figure1);
        arrayList.add(figure2);
        arrayList.add(figure3);

        for (Figure figure : arrayList) {
            System.out.println(figure.perimeterFigure());
        }
    }
}
