package Exercises;

public class JunkCharacters {
    public static void main (String args[]) {

        String s="@#$%&%&*welcome";

        s=s.replaceAll("[^a-zA-Z0-9]", ""); //excepts only what it is between regex other replace by no characters
        System.out.println(s); //welcome
    }
}
