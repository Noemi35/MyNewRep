package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {
    //Collections-an interface which store group of objects
    //Arraylist-a class which is implemented List interface:heterogeneous data, index, mutiple null okay, duplicate elements okay
    public static void main (String args[]) {

        //Declaration
        ArrayList list= new ArrayList();
//
//        List myList=new ArrayList<>(); //child can be hold in the parent (list)

//        ArrayList<Integer> list= new ArrayList<Integer>(); //hold only integer type of data
//        ArrayList<Employee> list= new ArrayList<Employee>(); //user defined ojects or predefined classes; any type of objects

        //adding data into arraylist; added the elements at the end of the list
        list.add(100);
        list.add(10.40);
        list.add("welcome");
        list.add(true);
        list.add('A');
        list.add(null);

        //size of an array list
       System.out.println(list.size()); //6

       //print array list
        System.out.println(list); //[100, 10.4, welcome, true, A, null]

        //remove element from arraylist
        list.remove(3);
        System.out.println(list); //true is removed (pozitia 3)


        //insert element in the array list; insert in the middle of the list
        list.add(2,"java");
        System.out.println(list);//[100, 10.4, java, welcome, A, null]

        //Modify an element in arraylist
        list.set(2, "python");
        System.out.println(list);  //[100, 10.4, python, welcome, A, null]

        //Access specific element from arraylist
        System.out.println(list.get(2)); //python

        //Reading all the elements from arraylist
        //using normal for loop
        for(int i=0; i<list.size(); i++) {
                 System.out.println(list.get(i));
        }

        //for each loop
        for (Object x:list) {
            System.out.println(x);

        }

        //using iterator
       Iterator it=list.iterator(); //iterator type of object from ArrayList -is a class

        while(it.hasNext()) { //check the element is there or not
            System.out.println(it.next());
        }


//        System.out.println(it.next()); //100; return first element in the round

     //checking arraylist is empty or not
        System.out.println(list.isEmpty());

        //remove all elements
        ArrayList list1= new ArrayList();
        list1.add("python");
        list1.add(100);

        System.out.println(list.removeAll(list1)); //remove random elements

        list.remove(list); //all elements
        list.clear(); //remove all elements; we can't get the elements back







    }
}
