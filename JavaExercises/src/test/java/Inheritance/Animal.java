package Inheritance;
 //super keyword -immediate parent class variable; immediate parent class method, immediate parent class constructor

public class Animal {
    String color="white";

    void eat() {
        System.out.println("eating/...");
    }

    Animal () { //constructor
        System.out.println("Animal");
    }

    Animal (String name) { //constructor
        System.out.println(name);
    }

}

class Dog extends  Animal {
    String color="black"; //overriding

    void displayColor() {
        System.out.println(super.color); //super invokes the parent class
    }

    void eat() {
//        System.out.println("eating bread");
        super.eat(); //invoke the parent
    }

    Dog() {  //constructor
        super(); //invoke the parent
//        System.out.println("Dog");

    }

    Dog (String name) { //constructor
        super(name);
    }
}