package com.amitesh;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        //trim()- it will remove extra spaces
        //charAt(0)- it will give you index at 0 , that is first character

        if (ch >= 'a' && ch <= 'z') System.out.println("Lower case ");
        else {
            System.out.println("Upper case");
        }
    }
}
