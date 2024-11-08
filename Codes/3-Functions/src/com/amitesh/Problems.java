package com.amitesh;

public class Problems {
    public static void main(String[] args) {
//        int ans = countFactors(24);
//        System.out.println("no of factors is "+ans);
//
//        checkPrime(33);
//        sumN(1000);

//        int res = squareRoot(24);
//        System.out.println(res);
        int res = digits(24);
        System.out.println(res);
    }
//Q. count all factors of int n .
    public static int countFactors(int n ){
        int count = 0;
        for (int i = 1; i*i<=n;i++){
            if (n%i==0){
                if (i!=n/i){
                    count += 2;
                    System.out.println(i+" "+n/i);
                }
                else count++;
            }
        }
        return count;
    }
    //Q. check whether int n is prime or not
    public static void checkPrime(int n){
        if(countFactors(n)>2){
            System.out.println("it is not prime ");
        }else System.out.println("it is prime");
    }

//Q. sum of n natural and whole number.
    public static void sumN(int n ){
        int ans = n*(n+1)/2;  //formula of sum of n natural numbers. 1,2,3,4,5
        int ans2 = (n-1)*(n-1+1)/2; //formula for n whole numbers . 0,1,2,3,4,5 (n = n-1)

        System.out.println(ans);
        System.out.println(ans2);
    }
    //Q. square root of a number.
    public static int squareRoot(int n ){
        int ans1 = 1;
        int i =1;
        while(i*i<=n){
            ans1 = i;
            i++;
        }
        return ans1;
    }
    //Q.product of digits - sum of digits
    public static int digits(int n ){
        int sum = 0 ;
        int product =1;
        while (n>0){
            int lastD = n%10;
            sum += lastD;
            product *= lastD;

            n=n/10;
        }
        int res = product - sum;
        return res ;
    }
}
