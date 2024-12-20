package Inheritance;

//Inheritance:
//single (parent-child)
//multi-level: c1-c2-c3 (the child of a parent can be parent to another child) parent-child-grandchild
//hierarchy: one parent with multiple children (no relation between children)
//multiple: one child can have multiple parents; we cannot use classes (it is not possible using multiple extends) we need interface; in the object is default parent class for all the classes in java (we invoke variables and methods)
//if there is a static method we do not need to create object for execution; directly called by jvm ; main-no returned value; string args[]-string type array; public-access modifier-everywhere; it works just with the string
class A {
    int a;

    void display() {
        System.out.println(a);
    }
}


class B extends A { //all methods and variables from A belong to b which becomes a child
    int b;

    void show() { //2 methods, 2 variables
        System.out.println(b);
    }
}

    class C extends B { //all methods and variables from A belong to b which becomes a child
        int c;

        void print() { //2 methods, 2 variables
            System.out.println(c);
        }
    }


public class InheritanceTypes {

    public static void main(String args[]) {
//        B obj=new B();
//        obj.a=10;
//        obj.b=20;
//        obj.display(); //10
//        obj.show();//20

        C obj = new C();
        obj.a = 10;
        obj.b = 20;
        obj.c=30;
        obj.display(); //10
        obj.show();//20
        obj.print(); //30


    }
}
