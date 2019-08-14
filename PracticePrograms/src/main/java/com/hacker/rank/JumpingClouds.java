package com.hacker.rank;

import java.util.Arrays;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(Integer[] c) {
        int totalJumps = 0;
        if (Arrays.stream(c).anyMatch(val -> val == 1)) {
            int i = 0;
            int next = 0, nextOfNext = 0;
            while(i < c.length) {
                //if()
                i++;
            }

        } else {
            int d = c.length / 2;
            int r = c.length % 2;
            return d + r;
        }
        return 0;
    }

    public static void main(String[] args) {
        jumpingOnClouds(new Integer[]{0, 1, 0, 0, 0, 1, 0}); //4
        jumpingOnClouds(new Integer[]{0, 0, 0, 0, 1, 0}); //3
        jumpingOnClouds(new Integer[]{0, 0, 1, 0, 0, 1, 0}); //4
    }
}
