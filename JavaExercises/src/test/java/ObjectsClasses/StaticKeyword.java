package ObjectsClasses;

public class StaticKeyword {
    //static methods can access static stuff directly (without objects)
    //if we use static we save memory and problem of update the variables of every object (it becomes the same variable on all the objects)
    //static methods can access everything directly


    static int a=10;
    int b=20;

   static void m1() {
        System.out.println("this is m1 method:");
    }

     void m2() {
        System.out.println("this is m2 method:");
    }

    static void main() {

    }

    public static void main(String args[]) {
        m1();  //we don not need object to access the methods
       System.out.println(a);

       StaticKeyword key=new StaticKeyword();
       System.out.println(key.b);
       key.m2();

       main(); //we can call directly without object because it is static

    }
}
