package com.amitesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strings & characters");

        String str = "amitesh";
        System.out.println(str);

        char ch = 'a';
        System.out.println(ch);

        //take input string
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("name: "+ name);

        //take input character
        //.charAt - it will convert the string in array format and then give the element at index 0 .
        //name  --> {n,a,m,e} --> n 
        char a = sc.nextLine().charAt(0);
        System.out.println("cahr :"+a);
    }
}