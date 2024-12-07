package com.amitesh;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        //1512. Number of Good Pairs
        int [] nums = {1,2,3,1,1,3};
        System.out.println("the good pairs are : "+ numIdenticalPairs(nums));

    }
    //Brute Force
    static int numIdenticalPairs(int[] nums){
        int countPairs = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j] && i < j){
                    countPairs++;
                }
            }
        }
        return countPairs;
    }
}
