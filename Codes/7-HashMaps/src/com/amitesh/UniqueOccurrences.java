package com.amitesh;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {
    public static void main(String[] args) {
        //1207. Unique Number of Occurrences
        int[] arr = {1,2};
        System.out.println(uniqueNumberOfOccurrences(arr));
    }
    public static boolean uniqueNumberOfOccurrences(int[] arr){
        //storing the number of occurrence of each element in hashmap.
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i : arr){
            if(hm.containsKey(i)){
                int temp = hm.get(i);
                hm.put(i,temp+1);
//                hm.compute(i,(key,temp) -> temp + 1);
            }else {
                hm.put(i,1);
            }
        }

        HashSet<Integer> hs = new HashSet<>();

        for(Integer value : hm.values()){
            if (!hs.add(value)) {  // `add` returns false if the value already exists
                return false;
            }
        }
        return true;
    }
}
