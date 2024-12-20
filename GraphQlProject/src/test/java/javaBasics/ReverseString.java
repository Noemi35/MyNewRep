package javaBasics;

public class ReverseString {

    public static  void main(String[] args) {
        String s="noemi"; //palindrome
        String t="";

        for(int i=s.length()-1; i>=0; i--) { //for reverse -- imeon

           t=t+s.charAt(i); //m; m+a; m+a+d; m+a+d+a; m+a+d+a+m

        }
        System.out.println(t);//madam
        if(s.equals(t)) {
            System.out.println(s+ " " + "this is a palindrome");
        }
        else {
            System.out.println("this is not a palindrome string");
        }


    }
}
