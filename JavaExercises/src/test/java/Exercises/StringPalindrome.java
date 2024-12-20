package Exercises;

import java.util.Scanner;

public class StringPalindrome {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        String str_original=str;

        String rev="";
        int len=str.length();

        for(int i=len-1; i>=0; i--) {
              rev=rev+str.charAt(i);

        }
        if(str_original.equals(rev)) { //str_origina==rev -comparison
            System.out.println("The word is a palindrome");
        }
        else {
            System.out.println("The word is not a palindrome");
        }

    }
}
