package Inheritance;

public class ChildClass extends ParentClass{

    public void engine() {
        System.out.println("new engine");
        super.engine(); //from parent class
    }

    public void colour() {
        System.out.println(s);
    }
    public static void main(String[] args) {

    ChildClass child=new ChildClass();
    child.colour();
    child.engine();

    }
}
