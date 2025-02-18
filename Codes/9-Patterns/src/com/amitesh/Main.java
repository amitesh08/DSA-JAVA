package com.amitesh;

public class Main {
    public static void main(String[] args) {
        System.out.println("PATTERNS");
//        pattern1(4);
//        pattern2(5);
//          pattern3(4);
//          pattern4(4);
        pattern5(4);
    }
     public static void pattern1(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print("* ");
            }
            //when 1 row is printed, then new line
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col<= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print(col+" " );
            }
            //when 1 row is printed, then new line
            System.out.println();
        }
    }
    public static void pattern5(int n ){
        for (int row = 0; row <= 2*n; row++){
            int c = row > n ? 2 * n - row : row;
            for(int col = 0; col < c ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}