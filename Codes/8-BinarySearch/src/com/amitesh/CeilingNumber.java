package com.amitesh;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 8, 8, 10};
        int target = 9;
        System.out.println(getCeilingNumber(nums, target));
    }
    public static int getCeilingNumber(int[] nums, int target){
        //edge case -> but what if target is greater than the greatest number in the array.
        if(target > nums[nums.length-1]) return -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]) {
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid +1;
            }
            else return nums[mid];
        }
        return nums[start];
    }
}
