package com.amitesh;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(reversedString(st));
    }
    public static String reversedString(String st){
        String[] arr = st.split(" ");

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", arr);
    }
}
