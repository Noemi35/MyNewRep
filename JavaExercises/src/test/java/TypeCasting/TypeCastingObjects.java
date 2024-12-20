package TypeCasting;


class Parent {

    String name="John";
    void m1() {
        System.out.println("m1");
    }

}

class Child extends Parent {

int x=100;
void m2() {
    System.out.println("m2");
}

}


public class TypeCastingObjects {

    public static void main (String args[]) {

//object class-the super parent of all classes
//        Child c = new Child();
//        System.out.println(c.name);
//        c.m1();
//        System.out.println(c.x);
//        c.m2();

//        Parent p=new Child(); //parent object oriented variable; up-casting
//        System.out.println(p.name);
//        System.out.println(p.x); //cannot access the child; because the reference of the object is from parent
//        p.m2(); //cannot access the child; because the reference of the object is from parent

//        Parent p1=new Parent();
//        Child c1=(Child) p1;
//        System.out.println(c1.name);
//        c1.m1();
//        System.out.println(c1.x);
//        c1.m2();



    }
}
