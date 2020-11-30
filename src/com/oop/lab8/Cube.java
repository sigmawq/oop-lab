package com.oop.lab8;

public class Cube implements GeometryBody{
    float side;
    public Cube(float iside){
        side = iside;
    }
    public float getSurface(){
        return 6 * side*side;
    }
    public float getVolume(){
        return side * side * side;
    }
}
