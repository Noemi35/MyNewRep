package WrapperClasses;

public class DataConversions {

    public static void main (String args[]) {
        //convert string to primitive data (int, double, float, char, boolean) -
        String s1="welcome"; //cannot convert into number, because has letters
        String s2="10";
        String s3="20";

        int sum=Integer.parseInt(s2)+Integer.parseInt(s3);

        System.out.println(sum); //30



        String s4="10.5";
        String s5="10.5";
        double sum1=Double.parseDouble(s3)+Double.parseDouble(s4);
        System.out.println(sum1); //30.5

        //string=>boolean (does not work)
        String s6="true";
        boolean bo=Boolean.parseBoolean(s6);
        System.out.println(bo); //true
        //string-char (not possible)

        //convert primitive data into string
        int x=100;
        String xStr=String.valueOf(x); //we can convert char, double, float, int, boolean ->string; static methods (autoboxing)
        System.out.println(x);

        double y=20.5;
        String d=String.valueOf(y);

        char c='a'; //char->string
        String cStr=String.valueOf(c);
        System.out.println(cStr);



        System.out.println(d);








    }
}
