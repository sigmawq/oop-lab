package com.oop.lab7;

public class Triangle extends Figure {
    float sideA;
    float sideB;
    float sideC;
    public Triangle(float isideA, float isideB, float isideC){
        sideA = isideA;
        sideB = isideB;
        sideC = isideC;
    }
    public float getArea(){
        float s = (sideA + sideB + sideC) / 2;
        return (float)Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
    public float getPerimeter(){
        return (sideA+sideB+sideC);
    }
}
