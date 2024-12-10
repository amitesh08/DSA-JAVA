package com.amitesh;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        //1389. Create Target Array in the Given Order.
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(targetArray(nums, index)));
    }
    //we solve easily using arrayList as it automatically pushes element if we try to insert at the same index again.
    static int[] targetArray(int[] nums, int[] index){
        ArrayList<Integer> result = new ArrayList<>(5);
        for(int i = 0; i < nums.length; i++){
            result.add(index[i], nums[i]);
        }
        //let's see how we can solve through arrays only.
        // so what we do is just convert arraylist to array though we can directly solve this using arrays only.
        int[] target = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            target[i] = result.get(i);
        }
        return target;
    }

}
