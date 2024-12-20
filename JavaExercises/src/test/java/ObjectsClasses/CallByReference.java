package ObjectsClasses;

public class CallByReference {

    public static void main(String args[]) {

  //called by reference
    Test test = new Test();
        test.num=100;
        System.out.println("Before assignment of the value: "+test.num); //100
        test.m2(test); //the original is impacted
        System.out.println("After assignment of the value: "+test.num); //200


}



}


