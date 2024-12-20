package Inheritance;


//can use the same name classes on this package (A,B,C -it is called duplication)
class Parent {

    void display(int a) {

        System.out.println(a);
    }
}

class Child1 extends  Parent {

    void print(int b) {

        System.out.println(b);
    }
}

class Child2 extends Parent{

    void show(int c) {

        System.out.println(c);
    }
}




public class HierarchyInheritance {
  public static void main (String arg[]) {

      Child1 child1=new Child1();
      child1.display(20);
      child1.print(30);

      Child2 child2=new Child2();
      child2.display(30);
      child2.show(20);

  }
}



