package com.company;

public class Main {

    public static void main(String[] args) {
        Bil Tesla = new Bil("Tesla", "X", "02930923", 4, "0.0.1", 55.22458, 11.757075, 0, 0);
        System.out.println(Tesla.toString());

        Rat.Rotation();
        System.out.println("Retningen hjulene peger i er " + Hjul.wheelRotation() + " grader i retning mod " + Rat.side);

        System.out.println(Hjul.wheelRotation());
    }
}
