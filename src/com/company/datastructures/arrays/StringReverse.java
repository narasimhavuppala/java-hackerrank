package com.company.datastructures.arrays;

public class StringReverse {


    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        stringReverse.reverseString("tiny");
    }

    private void reverseString(String message) {

        char[] messageArray = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            messageArray[i] = message.charAt(i);
        }

        int j = 0;

        char[] reverseStringArray = new char[message.length()];
        for (int i = messageArray.length - 1; i >= 0; i--) {
            reverseStringArray[j++] = messageArray[i];
        }

        System.out.println(reverseStringArray);

//        boolean flag = true;
//
//        for (int k = reverseStringArray.length - 1; k >= 0 ; k--) {
//            if (reverseStringArray[k] != messageArray[k]) {
//                flag = false;
//            }
//        }
//
//        if(flag) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
    }
}
