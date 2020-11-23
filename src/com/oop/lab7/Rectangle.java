package com.oop.lab7;
import com.oop.lab7.Figure;

public class Rectangle extends Figure{
    float sideA;
    float sideB;
    public Rectangle(float isideA, float isideB){
        sideA = isideA;
        sideB = isideB;
    }
    public float getArea(){
        return sideA * sideB;
    }
    public float getPerimeter(){
        return sideA * 2 + sideB * 2;
    }
}
