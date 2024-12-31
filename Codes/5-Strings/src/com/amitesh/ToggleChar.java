package com.amitesh;

import java.util.Scanner;

public class ToggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        char[] ch = new char[n];
        String str = sc.nextLine();

        // Check if the string is long enough
        if (str.length() < n) {
            System.out.println("Error: String is shorter than " + n + " characters.");
            return;
        }

        for (int i = 0; i < n; i++){
            ch[i] = str.charAt(i);
        }
        toggle(ch, n);
        String ans = new String(ch);  //another way -> String.valueOf(ch)
        System.out.println("toggled char: "+ ans);

    }
    public static void toggle(char[] ch, int n ){
        for (int i = 0; i < n; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                //it is in small case
                //to change in uppercase just add 32
                ch[i] = (char)(ch[i] + 32);  //explicit typecasting.
            }else {
                ch[i] = (char)(ch[i] - 32);   //explicit typecasting.
            }
        }
    }
}
