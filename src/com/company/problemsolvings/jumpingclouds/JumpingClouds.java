package com.company.problemsolvings.jumpingclouds;

public class JumpingClouds {

    public void run() {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 0, 0, 1, 0, 0}));
    }

    public static int jumpingOnClouds(int[] steps) {

        int numberOfJump = 0;
        int index = 0;
        for (int i = 0; i < steps.length ; i++) {

            if((i + 2) < steps.length) {
                if(steps[i + 2] == 0){
                    ++numberOfJump;
                    index = 1;
                    i += index;
                } else if (steps[i + 1] == 0) {
                    ++numberOfJump;
                }
            } else if ((i + 1) < steps.length){
                if(steps[i + 1] == 0){
                    ++numberOfJump;
                }
            }
        }

        return numberOfJump;

    }
}
