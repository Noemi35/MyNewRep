package files;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

    public static void main (String[] args) throws IOException {
        dataDriven dt=new dataDriven();
       ArrayList<String> data= dt.getData("Add Profile", "Assured");

       System.out.println(data.get(1));
       System.out.println(data.get(0));
       System.out.println(data.get(2));
    }
}
