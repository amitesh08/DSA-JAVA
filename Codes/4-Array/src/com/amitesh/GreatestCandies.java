package com.amitesh;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        //1431. Kids With the Greatest Number of Candies
        int[] nums = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        System.out.println(kidsWCandies(nums, extraCandies));
    }
    static List<Boolean> kidsWCandies(int[] candies, int extraCandies){
        List<Boolean> kidsWithMaxCandies = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for ( int kidCandies : candies){
            if(kidCandies > max) max = kidCandies;
        }
        for(int i = 0; i < candies.length; i++){
            candies[i] += extraCandies;
            if (candies[i] >= max ){
                kidsWithMaxCandies.add(true);
            }else kidsWithMaxCandies.add(false);
        }
        return kidsWithMaxCandies;
    }
}
