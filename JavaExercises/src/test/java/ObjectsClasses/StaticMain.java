package ObjectsClasses;

public class StaticMain {

    public static void main(String args[]) {
        StaticKeyword.m1();  //we don not need object to access the methods
        System.out.println(StaticKeyword.a); //we need to specify class to access static variables and methods from other class

        StaticKeyword key = new StaticKeyword(); //non-static class accessed only through object
        System.out.println(key.b);
        key.m2();



    }
}
