package com.amitesh;

public class Reverse {
    public static void main(String[] args) {
        int n = 23487;
        int reverse = 0;
        while (n > 0){
            int ans = n%10;
            n /= 10;

            reverse = reverse * 10 + ans;
        }
        System.out.println(reverse);
    }
}
