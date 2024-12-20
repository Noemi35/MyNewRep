package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;


public class HashSetDemo {
    //a class implented Set interface
    //index not preservedl heterogeneous data allowed, duplicate elements not allowed; only single null is allowed

    public static void main (String args[]) {
        //Declaration
        HashSet myset=new HashSet();
//
////        Set myset1= new HashSet();
//
//        HashSet <String> myset2 =new HashSet<String>();

        //adding value
        myset.add(100);
        myset.add('a');
        myset.add(100.45);
        myset.add("welcome");
        myset.add(null);
        myset.add(null);

        //Print HashSet
        System.out.println(myset); //[null, a, 100, 100.45, welcome]-different order

        //HashSet
        System.out.println(myset.size()); //5

        //remove element
        myset.remove(100); //direct value; the indexes not supported
        System.out.println(myset);

        //inserting element -the elements are stored in a random order so it is not possible
        //Access specific element -not possible
        //Convert Hashset to arraylist
        ArrayList array=new ArrayList<>(myset);
        System.out.println(array); //[null, a, 100.45, welcome]
        System.out.println(array.get(2)); //100.45 , by index

        //read elements using for each loop -; normal for loop-cannot use because it uses indexes
        for (Object x:myset) {
            System.out.println(x);
        }

        //using iterator
        Iterator <Object> it=myset.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //cannot remove multiple values
        myset.clear(); //remove all elements from HashSet







    }
}
