package com.amitesh;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //consider we don't know whether the array is asc or desc
        int[] arr = {4,5,10,18,19,29,32,45};
        int target = 5;
        System.out.println(orderAgnosticBS(arr, target));
    }
    public static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;

        boolean isAsc = arr[start] < arr[end];

        while ( start <= end){
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
