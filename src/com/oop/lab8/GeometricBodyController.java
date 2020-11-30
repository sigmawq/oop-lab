package com.oop.lab8;

import java.util.ArrayList;

public class GeometricBodyController {
    public static GeometryBody GreatestVolume(ArrayList<GeometryBody> arr){
        int maxIndex = -1;
        float maxVolume = -1;
        float currentVolume = -1;
        int ctr = 0;
        for (var gb : arr){
            currentVolume = gb.getVolume();
            if (currentVolume > maxVolume){
                maxIndex = ctr;
                maxVolume = currentVolume;
            }
            ctr++;
        }
        return arr.get(maxIndex);
    }
    public static GeometryBody GreatestSurface(ArrayList<GeometryBody> arr){
        int maxIndex = -1;
        float maxSurface = -1;
        float currentSurface = -1;
        int ctr = 0;
        for (var gb : arr){
            currentSurface = gb.getSurface();
            if (currentSurface > maxSurface){
                maxIndex = ctr;
                maxSurface = currentSurface;
            }
            ctr++;
        }
        return arr.get(maxIndex);
    }
}
