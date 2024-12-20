package ObjectsClasses;

public class BoxMain {
    public static void main (String args[]) {
        //we need different objects of a class for every constructor

        BoxConstructor b=new BoxConstructor();
        System.out.println(b.volume());
        BoxConstructor c=new BoxConstructor(10.5, 3.5, 7.8);
        System.out.println(c.volume());
        BoxConstructor l=new BoxConstructor(3.5);
        System.out.println(l.volume());


    }


}
