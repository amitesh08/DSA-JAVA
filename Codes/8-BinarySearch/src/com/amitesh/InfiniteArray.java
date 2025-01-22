package com.amitesh;

public class InfiniteArray {
    public static void main(String[] args) {
        //Q. find position of a element in a sorted array of a infinite numbers.
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170}; //suppose this is infinite.
        int target = 170;
        System.out.println(findingRange(nums, target));

    }

    public static int findingRange(int[] nums, int target){
        //first find the range
        //first start with a size of box 2
        int start = 0;
        int end = 1;
        //condition for the target to lie between the range.
        while (target > nums[end]){
            int newStart = end + 1;
            //double the box value;
            end = end + (end - start + 1)*2;
            start = newStart;

        }
        return binarySearch(nums, target, start , end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > nums[mid]){
                start = mid +1 ;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
