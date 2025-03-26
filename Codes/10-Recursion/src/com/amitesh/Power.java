package com.amitesh;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,6));
        System.out.println(optimalSolution(2,5));
    }
    public static int power(int a, int n){
        if(n == 1){
            return a;
        }

        int temp = power(a,n-1);

        return a*temp;
    }
    public static int optimalSolution(int a , int n ){
        if(n == 1){
            return a;
        }

        int temp = power(a,n/2);

        if (oddEven(n)) return temp*temp;

        return temp*temp*a;
    }
    public static boolean oddEven(int n ){
        if (n % 2 != 0) return false;
        return true;

    }
}
