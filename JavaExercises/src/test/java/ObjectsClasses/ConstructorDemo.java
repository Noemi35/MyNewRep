package ObjectsClasses;

public class ConstructorDemo {

    int x;
    int y;

    ConstructorDemo() { //default constructor
         x=10;
         y=23;
    }

    ConstructorDemo(int a, int b) { //parameterized constructor; assign the data; global variables=local variables
        x=a;
        y=b;
    }
    void sum() {
        System.out.println(x+y);
 }

  public static void main (String args[]) { //we cannot invoke multiple constructor in the same time, just by creating a new object
//        ConstructorDemo cd=new ConstructorDemo(); //for default constructor
//        cd.sum();

      ConstructorDemo cd=new ConstructorDemo(34, 45);
      cd.sum();
  }



}
