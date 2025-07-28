package com.amitesh;

import java.util.LinkedList;
import java.util.Queue;

public class KthNumber {
    //Q. generate kth number using 1 and 2
    public static String kthNumber(int k){
        Queue<String> q = new LinkedList<>();

        q.add("1");
        q.add("2");

        String ans = "";

        for (int i = 1; i <= k ; i++) {
            String temp = q.remove();
            ans = temp;

            q.add(temp + "1");
            q.add(temp + "2");
        }
        return ans;
    }
    public static void main(String[] args) {
        int k = 5;
        String ans = kthNumber(k);

        System.out.println(k+"th number is "+ans);
    }
}
