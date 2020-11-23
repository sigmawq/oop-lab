package com.oop.lab7;

public class Square extends Figure{
    float side;
    public Square(float iside){
        side = iside;
    }
    public float getArea(){
        return side * side;
    }
    public float getPerimeter(){
        return side * 4;
    }
}
