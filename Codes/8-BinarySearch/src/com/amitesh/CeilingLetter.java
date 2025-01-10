package com.amitesh;

public class CeilingLetter {
    public static void main(String[] args) {
        //Q.744. Find Smallest Letter Greater Than Target
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;

        if(target >= letters[end]){
            return letters[start];
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
