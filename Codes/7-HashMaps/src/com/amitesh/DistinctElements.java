package com.amitesh;

import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {20, 10, 10, 20, 10};
        int ans = uniqueElements(arr);
        System.out.println("distinct elements : "+ans);
    }
    public static int uniqueElements(int[] arr){
//        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr){
            hs.add(i);
        }
        return hs.size();
    }
}
