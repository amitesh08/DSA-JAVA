package com.amitesh;

import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("arr: "+ Arrays.toString(arr));
        System.out.println("duplicateArray: "+Arrays.toString(duplicate(arr)));

    }
    public static int[] duplicate(int[] arr ){
       int[] arr2 = new int[arr.length];
       for (int i = 0; i < arr.length; i++) arr2[i] = arr[i];

       return arr2;
    }
}
