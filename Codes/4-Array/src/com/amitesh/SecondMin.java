package com.amitesh;

public class SecondMin {
    public static void main(String[] args){
        //considering all the elements are positive.
        // if it included then wee have to return
        int[] nums = {1, 10, 4, 5, 2, 2, 0};

        System.out.println("second min element in the array is : "+secondMin(nums));
    }

    static int secondMin(int[] nums){
        // Edge case: if the array has less than 2 elements
        if (nums.length < 2) return -1;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : nums ){
            if (num < min){
                secondMin = min;
                min = num;
            } else if (num < secondMin && num!= min) {
                secondMin = num;
            }
        }
        return (secondMin == Integer.MAX_VALUE) ?  -1 : secondMin;
    }
}
