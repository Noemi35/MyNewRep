package ObjectsClasses;

public class Test {

    int num; //variabila clasei

//    void m1(int num) {
//        num = num + 10;
//        System.out.println("Values in the method: " + num);
//    }


    void m2(Test t) {  //accept test type of object;t is object of a class; everything from the class
     t.num=t.num+100;
     System.out.println("Values in the method: " + t.num); //200

    }

}
