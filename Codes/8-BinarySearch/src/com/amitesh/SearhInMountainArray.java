package com.amitesh;

public class SearhInMountainArray {
    public static void main(String[] args) {
        //Q. 1095- find in the Mountain array.
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));

    }
    public static int search(int[] arr ,int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticSearch(arr,0,peak,target);
        if(firstTry != -1){
            return firstTry;
        }else {
            //try to search in second half.
            return orderAgnosticSearch(arr, peak + 1, arr.length - 1, target);
        }
    }
    public static int peakIndex(int[] arr ){
        int start = 0;
        int end = arr.length -1;
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
    public static int orderAgnosticSearch(int[] arr, int start , int end, int target){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if( target < arr[mid]){
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid +1;
                }
            }

            else{
                if( target > arr[mid]){
                    end = mid -1;
                } else if (target < arr[mid]) {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
