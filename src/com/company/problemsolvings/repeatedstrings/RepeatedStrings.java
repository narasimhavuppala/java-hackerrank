package com.company.problemsolvings.repeatedstrings;

public class RepeatedStrings {

    public void run() {
        System.out.println(repeatedString("ceebbcb", 817723));
    }

    public static long repeatedString(String string, long n) {

        long numberOfLetter = 0;

        if(string.length() == 1 || string.indexOf('a') >= 0) {
            numberOfLetter = n;
        } else {
            long remaining = n % string.length();
            String remainingString = string.substring(0, (int) remaining);

            long numberOfSequence = n / string.length();

            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) == string.charAt(0)){
                    ++numberOfLetter;
                }
            }
            numberOfLetter = numberOfSequence * numberOfLetter;
            for (int i = 0; i < remainingString.length(); i++) {
                if(remainingString.charAt(i) == string.charAt(0)){
                    ++numberOfLetter;
                }
            }
        }


        return numberOfLetter;
    }
    // Complete the repeatedString function below. TOO SLOW
//    public static long repeatedString(String string, long n) {
//
//        long numberOfLetter = 0;
//
//        if(string.length() == 1) {
//            numberOfLetter = n;
//        } else {
//            String repeatedString = string;
//            long remaining = n % string.length();
//            long numberOfSequence = n / string.length();
//
//            long startTime = System.currentTimeMillis();
//
//            for (long i = 0; i < numberOfSequence - 1; i++) {
//                repeatedString = repeatedString.concat(string);
//            }
//            long finishTime = System.currentTimeMillis();
//            System.out.println("That took: " + (finishTime - startTime) + " ms");
//
//
//            String remainingString = string.substring(0, (int) remaining);
//            repeatedString = repeatedString.concat(remainingString);
//
//            long startTime2 = System.currentTimeMillis();
//
//            for (int i = 0; i < repeatedString.length(); i++) {
//                if(repeatedString.charAt(i) == string.charAt(0)){
//                    ++numberOfLetter;
//                }
//            }
//            long finishTime2 = System.currentTimeMillis();
//            System.out.println("That took: " + (finishTime2 - startTime2) + " ms");
//        }
//
//        return numberOfLetter;
//    }
}
