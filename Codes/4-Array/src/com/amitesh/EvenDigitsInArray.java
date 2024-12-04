package com.amitesh;

public class EvenDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {12,0,0,6,7896};

        System.out.println("the number of even number is : "+countEven(arr));
    }

    static int countEven(int[] nums){
        int evenCount = 0;
        for(int num : nums){
            if (isEven(num)) evenCount++;
        }
        return evenCount;
    }

    static boolean isEven(int num) {
        int ans = digit2(num);

        return ans % 2 == 0;
    }

    static int digit(int num){

        if (num < 0) num *= -1;
        if (num == 0) return  1;
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }

    //OPTIMISED APPROACH

    static int digit2(int num){
        if (num < 0) num *= -1;

        return (int)(Math.log10(num)) + 1;
    }
}
