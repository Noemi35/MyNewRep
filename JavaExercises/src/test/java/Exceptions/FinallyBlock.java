package Exceptions;

public class FinallyBlock {

    public static void main(String args[]) {
        String s = "welcome";
        try {
            System.out.println(s.length()); //always execute
        } catch (ArithmeticException e) {
            System.out.println("Exception handled"); //just when the exception is handled
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
