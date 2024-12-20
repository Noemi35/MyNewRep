package TypeCasting;

public class UpCasting {

    //converting value from smaller to higher
    //down casting-converting value from higher to smaller
    //int ->long
    //float->double

    public static void main (String args[]) {

        //up-casting ( store smaller value to large)
        int intvalue=100;
        long value=intvalue;
        System.out.println(value); //100

        float fvalue=100.56f;
        double dvalue=fvalue;
        System.out.println(dvalue);

        //down-casting (larger value to smaller type)
        //reduce by (int)
        long longvalue=100;
        int ivalue=(int)longvalue;

        double dovalues=123.56;
        float fvalues=(float)dovalues;

    }

}
