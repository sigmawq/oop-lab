package com.oop.lab8;

public class Sphere implements GeometryBody{
    float radius;
    public Sphere(float iradius){
        radius = iradius;
    }
    public float getSurface(){
        return (float)(4 * Math.PI * radius*radius);
    }
    public float getVolume(){
        return (float)((4/3) * Math.PI * radius*radius*radius);
    }
}
