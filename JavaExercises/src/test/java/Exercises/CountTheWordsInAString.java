package Exercises;

import java.util.Scanner;

public class CountTheWordsInAString {

    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:"); //welcome to java automation
        String str=sc.nextLine();

        int count=1;
        for(int i=0; i< str.length()-1; i++) //length incepe de la 1; i de la index de asta e -1
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1)!=' ')) //whenever we extract a word there should be a space and after the character there should not be any space
            {
                count++;
            }
        }
        System.out.println(count); //4



    }

}
