package javaBasics;

public class PracticeStrings {

    public static void main (String[] args) {

        String s="Payment 100$ paid";

//        String str=new String("Payment 100$ paid");
        System.out.println(s.charAt(11)); //print the eleven position -$

        String str1="Payments 100$ paid";
        System.out.println(str1.indexOf("$")); //12
       System.out.println(str1.substring(8));  //100$ paid


    }
}
