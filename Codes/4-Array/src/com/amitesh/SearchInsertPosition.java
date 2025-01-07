package com.amitesh;


public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int x){
        int s = 0;
        int e = nums.length-1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if (nums[mid] == x) return mid;

            // If x greater, ignore left half
            else if (nums[mid] < x) s = mid + 1;

            // If x is smaller, ignore right half
            else e = mid - 1;
        }
        return s;
    }
}
