package com.amitesh;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("reversed string : "+reverse(str));
    }
    public static String reverse(String str){
        char [] ch = str.toCharArray();
        int n = str.length();
        int sp = 0;       // startPoint
        int ep = n -1 ;  //endPoint

        while(sp < ep){
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }
        return String.valueOf(ch);
    }
}
