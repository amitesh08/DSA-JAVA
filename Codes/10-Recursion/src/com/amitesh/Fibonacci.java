package com.amitesh;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(fiboArr(10)));
        System.out.println(fibo2(5));
    }
    public static int fibo(int n){
        //base condition
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static int[] fiboArr(int n ){
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n;i++){
            fibo[i] = fibo(i);
        }
        return fibo;
    }
    public static int fibo2(int n){
        if(n < 2) return n;

        int temp1 = fibo2(n-1);
        int temp2 = fibo2(n-2);

        return temp1 + temp2;
    }
}
