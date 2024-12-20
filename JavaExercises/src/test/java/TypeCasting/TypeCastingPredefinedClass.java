package TypeCasting;



public class TypeCastingPredefinedClass {

    public static void main(String args[]) {

        //generic type can hold everything (parent-child, object-string)

        //rule one- relationship between obj and stringbuffer; return same type (stringbuffer)-rule 2; rule 3- relationship between string and stringbuffer
//    Object obj=new String("welcome");
//    StringBuffer sb=(StringBuffer) obj; //rule 3 failed- no relationship between string and string buffer
//    }

//        String s = new String("welcome");
//        StringBuffer sb = (String) s;

        Object obj1 = new String("welcome"); //all rule passed
        String s = (String) obj1;
        System.out.println(s); //welcome

    }

}
