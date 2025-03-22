package com.amitesh;

public class BeautifulString {
    public static void main(String[] args) {
        String str = "0110";
        System.out.println(minOperation(str));
    }
    public static int minOperation(String str){
        int n = str.length();
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < n ; i++){
            char exceptedChar1 = (i % 2 == 0) ? '0' : '1';
            char exceptedChar2 = (i % 2 == 0) ? '1' : '0';

            if(str.charAt(i) != exceptedChar1) count1++;
            if(str.charAt(i) != exceptedChar2) count2++;
        }

        return Math.min(count1, count2);
    }
}
