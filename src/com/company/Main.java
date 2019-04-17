package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[12];
        int i = 0;
        int countNegativeNumbers = 0;
        int countPositiveNumbers = 0;
        while (i < nums.length) {
            int random = -10 + (int) (Math.random() * 21);
            if (random < 0 && countNegativeNumbers < 6) {
                nums[i] = random;
                countNegativeNumbers++;
                i++;
            } else if (random > 0 && countPositiveNumbers < 6) {
                nums[i] = random;
                countPositiveNumbers++;
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

