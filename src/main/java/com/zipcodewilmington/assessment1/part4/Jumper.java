package com.zipcodewilmington.assessment1.part4;

import static java.lang.Integer.max;

public class Jumper {

    public int jumps(int k, int j) {

        if(j > k || j < 1) return k; // This is a guard against the extremes. jump cant be higher than flag
        // & jump cant be less than 1!

        int mod = k % j; //returns the remainder of k/j (the extra step needed)
        int div = k / j; //k/j tells you the amount of jumps can be made

        return mod + div; //NOW JUST ADD THEM!!
    }
}
