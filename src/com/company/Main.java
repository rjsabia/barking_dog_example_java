package com.company;

public class Main {

    public static void main(String[] args) {

        boolean barkCalc = bark(true, 2);
        respond(barkCalc);

    }

    public static boolean bark(boolean barking, int hourOfDay) {

        boolean wakeUp = false;

        if(barking && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <= 24))) {
            wakeUp = true;
            return wakeUp;
        }

        return wakeUp;

    }

    public static void respond(boolean barkCalc) {
        System.out.println(barkCalc);
    }
}
