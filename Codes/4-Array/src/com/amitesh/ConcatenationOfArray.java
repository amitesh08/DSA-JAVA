package com.amitesh;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[n + i]= nums[i];
        }
        return ans;
    }
}
