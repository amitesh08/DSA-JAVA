package com.amitesh;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        //Q. 33- Search in Rotated sorted Array.
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(search(arr,target));

    }
    public static int search(int[] arr, int target){
        int pivot = pivotSearch(arr);

        //if you did not find the pivot , the  array is not rotated
        if(pivot == -1){
            //just do normal binary search.
            return binarySearch(arr, target,0, arr.length-1);
        }
        //if pivot is found you have found two asc arrays
        if(arr[pivot] == target ){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot -1 );
        }
        return binarySearch(arr, target, pivot + 1, arr.length-1);

    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end-start)/ 2;
            if (arr[mid]  < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int pivotSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end ){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
               //that could be possibly the answer.
               return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                //this could also be the pivot.
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
