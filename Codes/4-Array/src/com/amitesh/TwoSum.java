package com.amitesh;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //Q. two sum
        int[] arr = {2, 4, 6, 9, 27, 2, 14, 2};
        int k = 10;
        int[] ans = twoSum(arr, k);
        System.out.println(Arrays.toString(ans));
    }

    // This solution is for unsorted  array . sorted array can be solved in more optimised approach.
    private static int[] twoSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == k - arr[i]) {  // we are just finding the remaining number.
                    return new int[] { i, j }; //return the array if found.
                }
            }
        }
        // If no valid pair is found, return an empty array
        return new int[] {};
    }
}