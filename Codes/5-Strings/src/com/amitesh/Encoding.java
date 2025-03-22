package com.amitesh;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(encode(str));
    }
    public static String encode(String str){
        StringBuilder sb = new StringBuilder();
        int frequency = 1;
        char currentChar = str.charAt(0);
        for(int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                frequency++;
            } else {
                sb.append(currentChar);
                sb.append(frequency);
                currentChar = str.charAt(i);
                frequency = 1;
            }
        }
        // Append the last character and its frequency
        sb.append(currentChar);
        sb.append(frequency);

        return sb.toString();
    }
}
