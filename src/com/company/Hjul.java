package com.company;

import java.util.Arrays;
import java.util.Random;

public class Hjul {

    public static int[] wheelRotation(){
        Random rnd = new Random();
        int[] wheels = new int[4];

        for (int i = 0; i < wheels.length; i++){
            wheels[i] = (rnd.nextInt(360) + 1) + Rat.rotation;
        }
        return wheels;
    }
}
