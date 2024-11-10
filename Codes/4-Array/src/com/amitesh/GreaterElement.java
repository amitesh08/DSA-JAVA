package com.amitesh;

public class GreaterElement {
    //Q. given a array count the total elements having at least 1 element greater than it.
    public static void main(String[] args) {
        int[] arr = {3,4,11,8,2,10,9,11,12};
        int res = elementsGreatest(arr);
        System.out.println(res);
    }
    public static int  elementsGreatest(int[] arr){
        int max = Integer.MIN_VALUE ;
        int validEle = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        for (int i =0 ; i< arr.length;i++){
            if(arr[i]!=max){
                validEle++;
            }
        }
        return validEle ;
    }
}
