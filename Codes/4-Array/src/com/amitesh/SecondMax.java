package com.amitesh;

public class SecondMax {
    public static void main(String[] args) {
        int[] nums = {32, 2, 5, 78, -1, 36};
        System.out.println("the second largest element in the array is : "+secondMax(nums));
    }

    static int secondMax(int[] nums){
        // Edge case: if the array has less than 2 elements
        if (nums.length < 2) return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for( int num : nums){
            if (num > max ) {
                secondMax = max ;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return ( (secondMax == Integer.MIN_VALUE ) ? -1 : secondMax);
    }
}
