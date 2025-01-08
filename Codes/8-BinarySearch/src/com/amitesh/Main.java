package com.amitesh;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] arr = {2,3,4,6,9,11,13,15,20,36,45};
        int target = 30;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr , int target){
        int s = 0;
        int e = arr.length -1;
        while (s <= e){
            int mid = s + (e-s)/ 2;
            if (arr[mid]  < target){
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}