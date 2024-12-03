package com.amitesh;

public class Unique_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 5, 6, 6};
        countUniqueAndDuplicates(arr);
    }

    public static void countUniqueAndDuplicates(int[] arr){
        int[] freq = new int[100];

        for (int num : arr){
            freq[num -1]++;   //if the input number is 7, increment freq[6] (because 7 - 1 = 6).
        }

        int uniqueCount = 0;
        int duplicateCount =0 ;

        for (int num : freq){
            if(num == 1) uniqueCount++;
            else if (num> 1 ) duplicateCount++;
        }

        System.out.println("Unique elements count: " + uniqueCount);
        System.out.println("Duplicate elements count: " + duplicateCount);
    }
}
