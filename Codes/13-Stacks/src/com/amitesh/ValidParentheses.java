package com.amitesh;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        //Q. 20. Valid Parentheses
        String b = "([])";
        boolean res = validParentheses(b);
        System.out.println(res);
    }

    public static boolean validParentheses(String b) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);

            //opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else { //if it is a closing bracket
                if (ch == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else return false;
                } else if (ch == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else return false;
                } else {
                    if (st.peek() == '[') {
                        st.pop();
                    } else return false;
                }
            }
        }
        return st.isEmpty();
    }
}

