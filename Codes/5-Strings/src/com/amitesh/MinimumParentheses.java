package com.amitesh;

import java.util.Scanner;

public class MinimumParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(parenthesesReq(str));
    }
    public static int parenthesesReq(String str){
        int openCount = 0;
        int closeCount = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                openCount++;
            }else{
                if (openCount > 0) openCount--;  //to avoid negative value
                else closeCount++;
            }
        }
        return openCount+closeCount;
    }
}
