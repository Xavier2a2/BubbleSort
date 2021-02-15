package com.sparta.aaron.Starters;

import java.util.Random;

public class RandomArrayGenerator {

    public static int[] generate(int size) {
        int[] anArray = new int[size];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (new Random()).nextInt(100);
        }
        return anArray;
    }
}
