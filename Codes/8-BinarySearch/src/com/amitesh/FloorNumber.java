package com.amitesh;

public class FloorNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,9,11,13,15,20,36,45};
        int target = 16;
        System.out.println(getFloorNumber(nums,target));
    }
    public static int getFloorNumber(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1 ;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else return nums[mid];
        }
        return nums[end];
    }
}
