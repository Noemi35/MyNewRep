package Abstraction;

public class MultipleInheritance implements I1, I2 {
//we cannot extend multiple classes on multiple inheritance c1 extends parent class implements I1, I2
    //hybrid inheritance -combine hierarchy and multiple inheritance
    //abstract class -extends subclasses; can have implemeted methods and abstract methods, can extend just one class; we use abstract keyword to create abstract class; we can create variable reference of an object and object
    //interface keyword for interface creation; we use only abstract methods, static and default; a class can implement multiple interfaces; we use c1 implements I1,I2; un copil extinde parintele; we can create only variable reference of the object
   public  void m1() {
        System.out.println("this is m1");
    }

    public  void m2() {
        System.out.println("this is m2");
    }


    public static void main(String args[]) {
        MultipleInheritance mli = new MultipleInheritance(); //we can access everything through object
        mli.m1();
        mli.m2();
        System.out.println(mli.x + mli.y);
    }
}
