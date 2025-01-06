package com.amitesh;

import java.util.HashMap;

public class MajorityElement {
    //Q. 169. Majority Element
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityValue(nums));
    }
    public static int majorityValue(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                int temp = hm.get(num);
                hm.put(num, temp + 1);
            } else {
                hm.put(num, 1);
            }
        }
        int ans = 0;
        for(int key : hm.keySet()){
            if (hm.get(key) > nums.length/2)
                ans = key;
        }
        return ans;
    }
}
