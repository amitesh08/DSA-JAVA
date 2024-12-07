package com.amitesh;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        //1365. How Many Numbers Are Smaller Than the Current Number
        int[] nums = {8,1,2,2,3};
        System.out.println("brute force "+Arrays.toString(smallerCount(nums)));
    }
    //this is brute force can be optimised.
    static int[] smallerCount(int[] nums){
        int[] countArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if (j != i && nums[i] > nums[j] ){
                    count++;
                }
                countArray[i] = count;
            }
        }
        return countArray;
    }
}
