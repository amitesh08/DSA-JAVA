package com.amitesh;

import java.util.Arrays;

public class OrderOfRemoval {
    public static void main(String[] args) {
        int[] arr = {4,2,6,7};
        int n = arr.length;
        System.out.println(lowestCost(arr,n));
    }
    public static int lowestCost(int[] arr, int n){
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i < n; i++){
            int temp = arr[i] * (n-i);
            ans = ans + temp;
        }
        return ans;
    }
}
