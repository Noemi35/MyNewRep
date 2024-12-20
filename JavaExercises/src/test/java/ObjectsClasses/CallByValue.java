package ObjectsClasses;

public class CallByValue {
    public static void main (String args[]) {
        //passing copy of the variable, de asta nu se reflecta in valoarea originala
        Test test = new Test();

//        int num=100;
//        System.out.println("Before assignment of the value: "+num); //100
//        test.m1(num); //actioneaza doar asupra metodei m1; the original value is not impacted
//        System.out.println("After assignment of the value: "+num); //100

    }
}
