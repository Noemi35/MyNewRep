package Exceptions;

import java.util.Scanner;

public class UncheckedExceptions {
    public static void main (String args[]) {
        //example 1
//        System.out.println("program started");
        Scanner sc=new Scanner(System.in); //get input from user
//
//        System.out.println("Enter number:");
//        int num=sc.nextInt();
//
//        System.out.println(100/num); //Arithmetic Exception
//
//        System.out.println("program ended");

        //example 2
//        int a[]=new int[5];
//
//        System.out.println("Enter position 0-4:");
//        int pos=sc.nextInt();
//
//        System.out.println("Enter value 0-4:");
//        int value=sc.nextInt();
//
//        a[pos]=value; //pos-indexul; value assigned by user
//
//        System.out.println(a[pos]); //ArrayIndexOutOfBoundsException


        //Example3
//        String s="welcome";
//        int conv=Integer.parseInt(s); //convert string in number format
//        System.out.println(conv); //123 ; NumberFormatException


        //example 4
        String s1=null;
        System.out.println(s1.length()); //.NullPointerException


    }
}
