package com.amitesh;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,4,5};
        int[] arr2 = {6,6,7,9,9};
        System.out.println("unique element is : "+findUnique(arr));
        System.out.println("unique element is : "+findUnique(arr2));
    }

    public static int findUnique(int[] arr){
        int n = arr.length;
        int ans = 0;     //as N^0 = N
        for (int i = 0; i < n; i++){
            ans = ans^arr[i];
        }
        return ans;
    }
}
