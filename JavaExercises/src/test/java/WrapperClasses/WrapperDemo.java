package WrapperClasses;

public class WrapperDemo {

    public static void main (String args[]) {
      int i=10;
      double s=10.5;
      char ch='a';
      boolean bo=false;
      Integer ionj=i; //int type (primitive type) to object format (auto-boxing concept); in this format we can store collections
        //collection only store object format- this is why we have to convert
       //String to primitive-unboxing
        //Primitive-String-autoboxng
        //ArrayList, HashMap, Hashset-> we use object format; Integer -> we can access all the methods from wrapper class
        //if we use variable for operations ->primitive type
        Double dobj=s;
        Character cobj=ch;
        Boolean bobj=bo;

        System.out.println(ionj+" "+dobj+" "+cobj+" "+bobj);

        //from object type to primitive type (unboxing)

        int value=ionj;
        double dvalue=s;
        char cvalue=cobj;
        boolean bvalue=bobj;

//        int x=100;
//        Interger d=100; //methods int x=100;
       String s1="100";
       String s2="200";
       //Scenario 1 String->int, double (primitive type)

        //int to double;
//        int v=200;
//        double d=v; //200.0
//        System.out.println(d);

        //double to int
        double d=200.56;
        int b=(int)d;  //(int)-typecasting
        System.out.println(b); //200

        //packages-buit-in packages (java.lang) and user defined packages (created by user, import)

      //  access modifiers -private (access in the class); default (access in the same package); protected (access in the package and other packages but with inheritance), public-everywhere in the project
        //





    }

}
