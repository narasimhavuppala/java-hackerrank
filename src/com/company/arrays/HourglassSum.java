package com.company.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HourglassSum {
    public void run() {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        System.out.println(hourglassSum(arr));
    }

    public int hourglassSum(int[][] arr) {
        List<Integer> sumTotal = new ArrayList<>();

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                System.out.println(arr[i][j]);
                int pOne = arr[i-1][j-1];
                int pTwo = arr[i-1][j];
                int pThree = arr[i-1][j+1];
                int pFour = arr[i][j];
                int pFive = arr[i+1][j-1];
                int pSix = arr[i+1][j];
                int pSeven = arr[i+1][j+1];
                int sum = pOne + pTwo + pThree + pFour + pFive + pSix + pSeven ;

                sumTotal.add(sum);
            }
        }
        return Collections.max(sumTotal);
    }

}
