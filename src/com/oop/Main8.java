package com.oop;

import com.oop.lab8.*;

import java.util.ArrayList;

public class Main8 {
    public static void main(String[] args){
        // 5 || 6
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(4);
        Parallelepiped parallelepiped = new Parallelepiped(6, 7, 8);
        ArrayList<GeometryBody> garr = new ArrayList<>();
        garr.add(cube);
        garr.add(sphere);
        garr.add(parallelepiped);

        // 7 || 8
        System.out.println("Max volume: " + GeometricBodyController.GreatestVolume(garr).getVolume());
        System.out.println("Max surface: "+ GeometricBodyController.GreatestSurface(garr).getSurface());

        // 9 || 10
        // Changed. Resolved all the problems.
    }
}
