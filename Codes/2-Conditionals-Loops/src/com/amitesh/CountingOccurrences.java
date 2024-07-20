package com.amitesh;

public class CountingOccurrences {
    public static void main(String[] args) {
        int n = 27377;
        int count = 0 ;
        while (n > 0){
            int rem = n % 10;
            n = n/10;
            if (rem == 7){
                count++;
            }
        }
        System.out.println("Count: "+count);

    }
}
