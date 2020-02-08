package com.company.problemsolvings.sockmerchant;

import java.util.HashMap;

public class SockMerchant {

    public void run() {
        int[] colors = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int socks = 9;

        int numbersOfPair = sockMerhant(socks, colors);
        System.out.println(numbersOfPair);
    }

    public static int sockMerhant(int socks, int[] colors) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int counter = 0;
        for (int i = 0; i < socks; i++) {
            if(hashMap.isEmpty()) {
                hashMap.put(colors[i], 1);
            } else {
                if(hashMap.containsKey(colors[i])) {
                    hashMap.put(colors[i], hashMap.get(colors[i]) + 1);
                } else {
                    hashMap.put(colors[i], 1);
                }
            }
        }

        for (Integer integer: hashMap.values()) {
            if(integer%2 == 0) {
                int temp = integer/2;
                counter += temp;
            } else {
                int temp = integer - 1;
                if(temp % 2 == 0) {
                    counter += temp/2;
                }
            }
        }
        System.out.println(hashMap);
        return counter;
    }
}
