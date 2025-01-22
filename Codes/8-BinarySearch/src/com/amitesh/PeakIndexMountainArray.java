package com.amitesh;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        //Q. 852. Peak Index in a Mountain Array
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        System.out.println(peakIndex(arr));

    }
    public static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                //you're in the dec part of the array.
                //but look for left for the answer or may this is the answer.
                end = mid;
            } else { //(arr[mid] < arr[mid - 1]) it is running this condition.
                //you're in the inc part of the array
                //may be this is the ans but check for right.
                start = mid + 1;
            }
        }
        //in the end start == end , & it will be pointing to the largest number in the array
        return end; // you can return anything start or end;
    }
}
