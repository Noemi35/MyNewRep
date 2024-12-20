package Exercises;

public class OcurencesOfCharacterString {
    public static void main (String args[]) {
        String s= "welcome java programming";

        int original_count=s.length();
        int count_AfterRemove=s.replaceAll("a", "").length(); //21

        System.out.println(count_AfterRemove); //welcome jv progrmming
        System.out.println(original_count); //24

        int OccurenceOfCharacters=original_count-count_AfterRemove;

        System.out.println(OccurenceOfCharacters); //3

    }
}
