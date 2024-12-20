
 class Test {
    final int x=100; //it remains constant; we cannot change the values
}
public class FinalKeyword {
   public static void main (String args[])  {
       Test tst=new Test();
//       tst.x=200;
       System.out.println(tst.x); //100
   }

}
