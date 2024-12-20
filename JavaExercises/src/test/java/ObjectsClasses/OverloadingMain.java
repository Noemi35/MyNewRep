package ObjectsClasses;

public class OverloadingMain {

    //we can achieve polymorphism through overloading; a thing can have many shapes

    public static void main (String args[]) {
        OverloadingMethod over= new OverloadingMethod();

        over.m1(); //300
        over.m1(20.5, 45.6); //66.1
        over.m1(3,6); //9
        over.m1(11,4.5); //15.5
        over.m1(3.2, 6); //9.2

    }
}
