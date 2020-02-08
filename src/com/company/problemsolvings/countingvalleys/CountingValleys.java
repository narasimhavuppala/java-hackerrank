package com.company.problemsolvings.countingvalleys;

public class CountingValleys {
    public void run() {
        int n = countingValleys(12, "DDUUDDUDUUUD");
        System.out.println(n);
    }

    public static int countingValleys(int numberOfSteps, String sequence) {


        int baseLevel = 0;
        int counter = 0;
        for (int i = 0; i < numberOfSteps; i++) {
            Character c = sequence.charAt(i);
            if(c.equals('D')) {
                counter--;
            } else if (c.equals('U')) {
                counter++;
            }

            if(counter == 0) {

                if(c.equals('U')) {
                    baseLevel++;
                }

            }

        }

        return baseLevel;
    }
}
