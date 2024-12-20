package Exceptions;

public class ThrowKeyword {
    //throws-checked exceptions
    //throw -user defined exceptions

    void checkSum (int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is negative");
        } else {
          System.out.println(num*num);
        }
    }
    public static void main (String args[]) {

        ThrowKeyword thr=new ThrowKeyword();
        try {
            thr.checkSum(-1); //number is negative; throw intentionally an exception
        }
        catch (Exception e) {
            System.out.println("exception handled");
            System.out.println(e.getMessage());
        }
    }
}
