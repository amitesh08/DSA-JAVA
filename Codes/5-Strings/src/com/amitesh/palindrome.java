package com.amitesh;

public class palindrome {
    public static void main(String[] args) {
        String str = "ele";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i <= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end) {
                return false;
            }
        }
//        char start = str.charAt(0);
//        char end = str.charAt(str.length()-1);
//        while (start <= end ){
//            if (start != end ){
//                return false;
//            } else if (start == end) {
//                start++;
//                end--;
//            }
//        }
        return true;
    }
}
