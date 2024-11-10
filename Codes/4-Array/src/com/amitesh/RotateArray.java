package com.amitesh;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        //Q. rotate the array from last to first by K times.
        int[] arr = {3,-2,1,4,6,9,8};
        int k = 100;
        int[] res = rotateArray(arr,k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] rotateArray(int[] arr, int k){
        k %= arr.length;
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);

        return arr;
    }

    public static int[] reverseArray(int[] arr , int start , int end ){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
