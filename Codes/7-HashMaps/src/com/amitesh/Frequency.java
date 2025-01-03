package com.amitesh;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        //Q. given N array elements & Queries for every query find frequency of element in array.
        int[] arr = {2, 6, 3, 8, 2, 9, 3, 10, 6, 2};
        int[] queries = {2, 5, 3, 8, 5};
        frequencies(arr, queries);
    }
    public static void frequencies(int[] arr, int[] queries){
        int n = arr.length;
        HashMap<Integer,Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (counter.containsKey(arr[i])) {
                int temp = counter.get(arr[i]);
                counter.put(arr[i], temp + 1);
            } else {
                counter.put(arr[i], 1);

            }
        }

        for(int i=0; i < queries.length; i++){
            int keys = queries[i];
            if(counter.containsKey(keys)) {
                System.out.print(queries[i]+ " ");
                System.out.println(counter.get(keys));
            }
            else {
                System.out.print(queries[i] + " ");
                System.out.println("0");
            }
        }
    }
}