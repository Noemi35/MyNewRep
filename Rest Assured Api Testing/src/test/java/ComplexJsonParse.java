import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

    public static void main (String [] args) {

        JsonPath js=new JsonPath(Payload.cousePrice());

        //print no of courses returned by API

        int count= js.getInt("courses.size()"); //count the courses; apply only on array
        System.out.println(count); //3

        //print purchase amount

       int totalAmount= js.getInt("dashboard.purchaseAmount");
        System.out.println(totalAmount);//910

        //Print title of the first course
       String titleFirstCourse=  js.get("courses[0].title");
       System.out.println(titleFirstCourse); //Selenium Python

        //Print all courses titles and their respective prices

        for(int i=0; i<count; i++) {
          String courseTitles= js.get("courses["+i+"].title");
          System.out.println(js.get("courses["+i+"].price").toString()); //convert to string to not store into a variable
          System.out.println(courseTitles);



        }

        //print no. of copies sold by RPA

        System.out.println("print no. of copies sold by RPA");
        for(int i=0; i<count; i++) {
            String courseTitles= js.get("courses["+i+"].title");
            if(courseTitles.equalsIgnoreCase("RPA"))
            {
                int copies= js.get("courses["+i+"].copies");
                System.out.println(copies); //10
                break; //optimize the code; don't go far if you found the right one
                        //copies sold
            }
        }





    }
}
