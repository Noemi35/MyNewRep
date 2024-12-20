package Exceptions;

import java.util.Scanner;

public class HandleExceptions {

    public static void main (String args[]) {
        //exceptions -checked and unchecked; logical and syntax

        //example 1
//        System.out.println("program started");
        Scanner sc = new Scanner(System.in); //get input from user
//
//        System.out.println("Enter number:");
//        int num = sc.nextInt();
//        try {
//            System.out.println(100 / num); //Arithmetic Exception
//        }
//        catch (ArithmeticException e){  //ignore the statement
//            System.out.println("invalid input");
//           System.out.println(e.getMessage()); /// by zero
//        }
//        System.out.println("program ended");

        //example2
        int a[]=new int[5];

        System.out.println("Enter position 0-4:");
        int pos=sc.nextInt();

        System.out.println("Enter value 0-4:");
        int value=sc.nextInt();
        try {
            a[pos] = value; //pos-indexul; value assigned by user
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position");
            System.out.println(e.getMessage()); //Index 7 out of bounds for length 5

        }
        System.out.println(a[pos]); //ArrayIndexOutOfBoundsException
    }
}
