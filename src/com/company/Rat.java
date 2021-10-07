package com.company;


import java.util.Scanner;

public class Rat {
    public static int rotation = 0;
    static String side = "ligeud";
    static Scanner scn = new Scanner(System.in);

    public static int Rotation() {
        System.out.println("Hvilken side drejer du til?");
        String retning = scn.nextLine();
        System.out.println("Hvor mange grader drejer du?");
        int drejValg = scn.nextInt();

        if (retning.equals("Venstre") || retning.equals("venstre") || retning.equals("v") || retning.equals("V")) {
            if (drejValg >= 30|| drejValg <= -30) {
                System.out.println("For risikabel drejning, annullerer orderer.");
            } else {
                rotation = rotation + drejValg;
            }
        }
        if (retning.equals("Højre") || retning.equals("højre") || retning.equals("h") || retning.equals("H")) {
            drejValg = -drejValg;
            if (drejValg >= 30 || drejValg <= -30 ) {
                System.out.println("For risikabel drejning, annullerer orderer.");
            } else {
                rotation = rotation + drejValg;
            }
        }
        if (rotation < 0) {
            side = "højre";
            System.out.println("Du har drejet " + (-rotation) + " grader til " + side);
        }
        if (rotation > 0) {
            side = "venstre";
            System.out.println("Du har drejet " + rotation + " grader til " + side);
        }
        if (rotation == 0) {
            System.out.println("Du kører stadig ligeud.");
        }
        return rotation;
    }
}

