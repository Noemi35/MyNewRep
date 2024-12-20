package ObjectsClasses;

public class OverloadMainMethod {


    void main (int a) {
        System.out.println(a);  //10
    }

    void main (int a, int b) {
        System.out.println("The sum of the following number is: "+(a+b)); //77
    }
    public static void main (String[] args) {

        OverloadMainMethod load=new OverloadMainMethod();
        load.main(10);
        load.main(10, 67);

    }
}
