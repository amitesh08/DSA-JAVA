package com.amitesh;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0 ;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("sum of arrays is "+sum);
        System.out.println("max is array "+max);

    }
}
