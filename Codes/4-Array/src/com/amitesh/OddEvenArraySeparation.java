package com.amitesh;

import java.util.ArrayList;

public class OddEvenArraySeparation {
    public static void main(String[] args) {
        int[] arr = {2,4,6,4,6,8};
        separateArray(arr);
    }
    public static boolean oddEven(int number){
        return number % 2 == 0;
    }

    public static void separateArray(int[] arr){
        //using arrayList to tackle this problem as initially I don't know the size of odd and even array .
        // arraylist can take care of it.
        ArrayList<Integer> odd = new ArrayList<>(5);
        ArrayList<Integer> even = new ArrayList<>(5);

        for(int num : arr){
            if (oddEven(num)) even.add(num);
            else odd.add(num);
        }

        System.out.println("Odd elements: " + (odd.isEmpty() ? "No odd elements present" : odd));
        System.out.println("Even elements: " + (even.isEmpty() ? "No even elements present" : even));

    }
}
