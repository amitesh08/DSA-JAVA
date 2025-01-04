package com.amitesh;

import java.util.HashMap;

public class NonRepeating {
    public static void main(String[] args) {
        //Q. find the first non-repeating element.
        int[] arr = {5, 4, 4, 2, 3, 6, 7, 5, 6};
        firstNonRepeating(arr);
    }

    public static void firstNonRepeating(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(count.containsKey(arr[i])){
                int temp = count.get(arr[i]);
                count.put(arr[i],temp+1);
            }else{
                count.put(arr[i],1);
            }
        }

        for (int j : arr) {
            if (count.get(j) == 1) {
                System.out.println("first non repeating element is "+j + ", appearing only " + count.get(j));
                break;
            }
        }
        //Time complexity --> O(2N) -> O(N)
    }
}
