package ObjectsClasses;

public class OverloadingMethod {
  ///Polymorphism:
    //same name of the method
    //different number of parameters
    //different type of data
    //different order of the parameters

    int a=100;
    int b=200;
    void m1() {
        System.out.println(a+b);
    }

    void m1(int a, int b) {
        System.out.println(a+b);
    }

    void m1(double a, double b) {
        System.out.println(a+b);
    }


    void m1(int a, double b) {
        System.out.println(a+b);
    }

    void m1(double b,int a) {
        System.out.println(a+b);
    }

}
