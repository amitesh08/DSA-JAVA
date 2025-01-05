package com.amitesh;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        //optimal solution for TwoSum.
        int[] arr = {8, 9, 1, -2, 4, 5, 11, -6, 7, 5};
        int k = 14;
        System.out.println(pairSum(arr,k));
    }
    public static boolean pairSum(int[] arr, int k ){
        //store all the values and their frequencies in the hashmap.
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int j : arr) {
            if (hm.containsKey(j)) {
                int temp = hm.get(j);
                hm.put(j, temp + 1);
            } else {
                hm.put(j, 1);
            }
        }
        for (int a : arr) {
            int b = k - a;
            if (a != b && (hm.containsKey(b))) {
                return true;
            } else if ((a == b && (hm.containsKey(b)) && (hm.get(b) > 1))) {
                return true;
            }

        }
        //if didn't find anything just return false
        return false;
    }
}
