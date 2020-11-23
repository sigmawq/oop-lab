package com.oop;


import com.oop.lab7.*;

import java.util.ArrayList;

public class Main7 {

    public static void main(String[] args){
        // 5 || 6
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(new Rectangle(5, 5));
        figures.add(new Square(1));
        figures.add(new Triangle(5, 5, 5));

        // 7 || 8
        System.out.println("Max area: " + FigureController.GetBiggestArea(figures).getArea());
        System.out.println("Max perimeter: " + FigureController.GetBiggestPerimeter(figures).getPerimeter());

        // 9 || 10
        Figure circle = new Figure() {
            float radius = 50;
            @Override
            public float getArea() {
                return (float)Math.PI * radius;
            }

            @Override
            public float getPerimeter() {
                return (float)(2 * Math.PI * radius * radius);
            }
        };
        figures.add(circle);
        System.out.println("Max Area with circle: " + FigureController.GetBiggestArea(figures).getArea());

    }
}
