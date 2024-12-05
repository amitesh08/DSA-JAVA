package com.amitesh;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{3,7,1}};

        System.out.println("max Wealth is : "+ wealth(nums));
    }
    static int wealth(int[][] nums){
        int maxWealth = 0;
        int wealth = 0;
        for (int[] row : nums) {
            wealth = 0;
            for (int col : row) {
                wealth += col;
            }
            if (maxWealth < wealth) maxWealth = wealth;

        }
        return maxWealth;
    }
}
