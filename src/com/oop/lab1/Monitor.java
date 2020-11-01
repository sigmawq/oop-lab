package com.oop.lab1;

public class Monitor{
    private String name;
    private float colorR, colorG, colorB; // RGB color
    private float aspectRatio; // I don't know what a dimension of a monitor is, so let it be just aspect ratio
    private int resX, resY; // Monitor resolution

    // Constructor
    public Monitor(String name, float[] color, int width, int height){
        SetName(name);
        SetColor(color[0], color[1], color[2]);
        SetResolution(width, height);
    }

    // Setters
    public void SetName(String monitorName){
        name = monitorName;
    }

    public void SetColor(float r, float g, float b){
        colorR = r; colorG = g; colorB = b;
    }
    public void SetResolution(int width, int height){
        if (width < 0 || height < 0){
            System.out.println("Width/Height of any monitor should be positive");
            return;
        }
        resX = width; resY = height;
        aspectRatio = width / (float)height;
    }
    // Getters
    public String GetName(){
        return name;
    }

    public float[] GetColor(){
        float[] toReturn;
        toReturn = new float[] {colorR, colorG, colorB};
        return toReturn;
    }
    public float GetAspectRatio(){
        return aspectRatio;
    }
    public int[] GetResolution(){
        return new int[] { resX, resY };
    }


    // Summarize this class to console
    public void Summary(){
        System.out.println("Monitor data:");
        System.out.println("Name: " + name);
        System.out.println("Resolution: " + resX + "x" + resY);
        System.out.println("Color (RGB): " + colorR + ", " + colorG + ", " + colorB);
        System.out.println("Aspect Ratio: " + aspectRatio);
    }

    // This method compares two monitors
    public boolean Comapre(Monitor otherMonitor){
        if (this.resX != otherMonitor.resX || this.resY != otherMonitor.resY || this.aspectRatio != otherMonitor.aspectRatio
                || this.colorR != otherMonitor.colorR || this.colorG != otherMonitor.colorG || this.colorB != otherMonitor.colorB)
        {
            System.out.println("Monitors " + this.name + " and " + otherMonitor.name + " are different");
            return false;
        }
        System.out.println("Monitors " + this.name + " and " + otherMonitor.name + " are same");
        return true;
    }
}
