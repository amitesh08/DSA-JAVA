package com.amitesh;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
    public static int sumOfN(int n){
        if (n == 1 ) return 1 ;

        int temp = sumOfN(n-1);

        return temp+n;
    }
}
