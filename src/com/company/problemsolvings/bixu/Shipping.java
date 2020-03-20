package com.company.problemsolvings.bixu;

public class Shipping {
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {

        int numberOfPackages = 0;
        int minimumRequirement = (availableLargePackages * 5) + availableSmallPackages;
        if(items > minimumRequirement) {
            return -1;
        }
        if (items == 0 ) {
            return 0;
        }

        int i = 0;
        while (i < availableLargePackages && items >= 5) {
            items = items - 5;
            numberOfPackages++;
            i++;
        }

        int j = 0;
        while (j < availableSmallPackages && items != 0) {
            items--;
            numberOfPackages++;
            j++;
        }

        return numberOfPackages;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(16, 2, 10));
    }
}
