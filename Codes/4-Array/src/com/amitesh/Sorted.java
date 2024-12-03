package com.amitesh;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {0};
        int n = arr.length;
        isSorted(arr, n);
    }

    public static void isSorted(int[] arr , int n ){
        // Handle edge cases for arrays with one or zero elements
        if (n <= 1) {
            System.out.println("Array is trivially sorted (contains 0 or 1 element).");
            return;
        }

        boolean isAscending = true ;
        boolean isDescending = true ;
        for(int i=0; i< n-1; i++){
                if (arr[i] < arr[i+1]) {
                    isDescending = false;
                }
                else if (arr[i] > arr[i+1]) {
                    isAscending = false;
                }
        }
        if(!isAscending && !isDescending) {
            System.out.println("array is not at all sorted.");
        } else if (isAscending) System.out.println("array is forward sorted");
        else System.out.println("array is backward sorted");

    }
}
