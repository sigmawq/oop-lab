package com.oop.lab2;

// 5 || 6
public class Box {
    private int height, width, depth;
    public Box(){
        height = 1; width = 1; depth = 1;
    }
    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public Box(int uniformValueForAllVariables){
        height = uniformValueForAllVariables; width = uniformValueForAllVariables;
        depth = uniformValueForAllVariables;
    }
    public int CalculateVolume(){
        return height * width * height;
    }
    public int CalculateSurfaceArea(){
        return 2 * (height * width) + 2 * (width * depth) + 2 * (height * depth);
    }
}
