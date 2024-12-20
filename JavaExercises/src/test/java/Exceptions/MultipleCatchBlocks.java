package Exceptions;

import java.util.Scanner;

public class MultipleCatchBlocks {
//when we don't know what type of exception we put multiple catch blocks or by specifying exception class
    //finally block also execute- evern the try-catch block does not handle the exception
    public static void main (String args[]) {

        System.out.println("program started");
        Scanner sc=new Scanner(System.in);
        String s1=null;
        try {
            System.out.println(s1.length()); //.NullPointerException
        }
        catch(Exception e) {  //up-casting (this exception classs can hold all types of the exceptions)
            System.out.println("invalid");
        }
//        catch(NullPointerException e) {
//            System.out.println("invalid");
//        }
//        catch (NumberFormatException e) {
//            System.out.println("invalid");
//        }
        System.out.println("program ended");
    }
}
