package com.amitesh;

public class TwoSum {
    public static void main(String[] args) {
        //Q. two sum
        int[] arr = {2,4,6,9,27,2,14,2};
        int k = 5;
        System.out.println(twoSum(arr, k));
    }

    private static boolean twoSum(int[] arr, int k) {
        int j = arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]+arr[j]==k){
                return true;
            }
            j--;
        }
        return false;
    }
}
