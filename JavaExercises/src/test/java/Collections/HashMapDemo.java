package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapDemo {
    //key:value -the combination is a parent; they should not be repeated ; values can be duplicated, keys are unique; insertion order not preserved (no indexes)
    //hashMap-a class implemented by Map interface
    public static void main(String args[]) {


        //declare hashmap
        HashMap<Integer, String> hsmp = new HashMap<Integer, String>();
//    Map hsm=new HashMap<>(); //parent (reference object variable)-child (new object created)

        //adding elements
        hsmp.put(100, "welcome");
        hsmp.put(101, "marry");
        hsmp.put(102, "john");
        hsmp.put(103, "mark");
        hsmp.put(101, "mark"); //marry se inlocuieste cu mark

        System.out.println(hsmp); //{100=welcome, 101=marry, 102=john, 103=mark} -print as list

        System.out.println(hsmp.size()); //4 pairs

        //remove pair
        System.out.println(hsmp.remove(103));
        System.out.println(hsmp); //pair removed

        //access value of the key
        System.out.println(hsmp.get(102)); //john (value)

        //get all the keys from HashMap
        System.out.println(hsmp.keySet()); //[100, 101, 102]
        System.out.println(hsmp.values()); //retrieve values
        System.out.println(hsmp.entrySet()); //return keys+values //[100=welcome, 101=mark, 102=john]-print as set

        //reading data with for each loop
        for(int k:hsmp.keySet()) { //read each key and store into variable
            System.out.println(k+" "+hsmp.get(k));
        }

        //using iterator

        Iterator<Map.Entry<Integer, String>> it=hsmp.entrySet().iterator();
        while (it.hasNext()) { //return first entry (value+keY)
          Map.Entry <Integer,String> entry=it.next();
          System.out.println(entry.getKey()+" "+entry.getValue());
        }

        hsmp.clear();
        System.out.println(hsmp.isEmpty()); //true







    }


}
