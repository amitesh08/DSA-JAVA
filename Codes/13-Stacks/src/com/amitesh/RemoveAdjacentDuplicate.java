package com.amitesh;

import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        //Q. 1047. Remove All Adjacent Duplicates In String
        String s = "abbcdeecfggf";
        String res = removeDuplicates(s);
        System.out.println(s);
        System.out.println(res);
    }
    public static String removeDuplicates(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
