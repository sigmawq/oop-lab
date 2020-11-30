package com.oop.lab8;

public class Parallelepiped implements GeometryBody{
    float sideA, sideB, sideC;
    public Parallelepiped(float isideA, float isideB, float isideC){
        sideA = isideA;
        sideB = isideB;
        sideC = isideC;
    }
    public float getSurface(){
        return 2 * (sideA * sideB) + 2 * (sideB * sideC) + 2 * (sideC * sideA);
    }
    public float getVolume(){
        return sideA*sideB*sideC;
    }
}
