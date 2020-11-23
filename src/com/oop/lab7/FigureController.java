package com.oop.lab7;

import java.util.ArrayList;

public class FigureController {
    public static Figure GetBiggestArea(ArrayList<Figure> figureList){
        float maxArea = -1;
        Figure maxFigure = null;
        for (Figure f : figureList){
            float area = f.getArea();
            if (area > maxArea){
                maxArea = area;
                maxFigure = f;
            }
        }
        return maxFigure;
    }
    public static Figure GetBiggestPerimeter(ArrayList<Figure> figureList){
        float maxPerimeter = -1;
        Figure maxFigure = null;
        for (Figure f : figureList){
            float area = f.getPerimeter();
            if (area > maxPerimeter){
                maxPerimeter = area;
                maxFigure = f;
            }
        }
        return maxFigure;
    }
}
