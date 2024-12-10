package com.amitesh;

public class HighestArray {
    public static void main(String[] args) {
//        1732. Find the Highest Altitude
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println("max altitude is : "+maxAltitude(gain));
    }
    static int maxAltitude(int[] gain){
        int max = 0;  //gain should start with 0 that is y it is init as 0;
        int sum = 0;
        for ( int increasedAlt : gain){
            sum += increasedAlt;
            if (sum > max) max = sum;
        }
        return max;
    }
}
