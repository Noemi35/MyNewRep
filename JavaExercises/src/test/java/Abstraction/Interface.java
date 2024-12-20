package Abstraction;

interface Shape {

    int x=10; // variables are final and static by default
    int y=20;

    void circle();  //abstract method; public

    static void rectangular () {
    System.out.println("rectangular static method");
    }

    default void square () {
        System.out.println("square default method");
    }
}






public class Interface implements Shape{
//abstraction -class (there is the implementation) but in the interface we can only access the functionality
    //object reference variable Animal obj=new Animal()- new keyword is for creating a new object and obj is the object reference variable that we use
    //when create the object is called instantiation; we cannot create an object for an interface; we access the object from class
    //interfaces are for requirements (the devs don't know the implementation now, just later they will understand design)

    public void circle() {
        System.out.println("circle public method");
    }
    public static void main (String args[]) {
        Interface intes = new Interface();
        intes.circle(); //abstract
        intes.triangle();
        intes.square();
        Shape.rectangular(); //static; access directly but we need to specify the name of the interface
        System.out.println(Shape.y+ Shape.x); //acces through name of interface
        System.out.println(intes.y+ intes.x); //also through the object

        //Scenario 2
        Shape sh=new Interface();
        sh.circle();
        sh.square();
        //static needs to be access directly, not through object
        Shape.rectangular();
       // sh.triangle(); we cannot access the method from the class, just the methods from the interface

    }

    void triangle() {
        System.out.println("this is triangle");
    }



}
