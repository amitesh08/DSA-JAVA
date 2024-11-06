package com.amitesh;

public class Fact {
    public static void main(String[] args) {

        int res = fact(4);
        System.out.println(res);
    }

    public static int fact(int n){
        int ans = 1 ;

        for (int i = 1; i <=n ; i++) {
            ans*=i;

        }
        return ans ;
    }
}
