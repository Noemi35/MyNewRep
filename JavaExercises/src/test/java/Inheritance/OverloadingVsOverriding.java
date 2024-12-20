package Inheritance;

class ABC {
    void m1(int a) {
        System.out.println(a);
    }


    void m2(int b) {
     System.out.println(b);
    }
}


class XYZ extends ABC {



        void m1(int a) {
            System.out.println(a*a); //overriding -we changed the body but the signature is the same (same name of the method as the parent)
        }


        void m2(int b) {
            System.out.println(b*b);
        }


void m2(int b, int a) {  //overloading
    System.out.println(a+b);
}
    }






public class OverloadingVsOverriding {
    public static void main(String args[]) {


    XYZ xyzobj = new XYZ();
    xyzobj.m1(10);
    xyzobj.m2(20);
    xyzobj.m2(20,40);

}
}
