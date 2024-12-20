package ObjectsClasses;

public class StudentMain {
    public static void main (String args[]) {
 // Store data to initialize data:
        //first approach -assign data using object reference
//        Student stu=new Student(); //object with variable
//        stu.grade=10;
//        stu.sname="Mary";
//        stu.sid=1;
//        stu.department="Automation";
//
//        stu.display();

        // Second Approach-assign data using user defined method

//        stu.setUp(23, "Luis",6,"Robotics"); //assign
//        stu.displayon(); //23 Luis 6 Robotics

        //Third approach-constructor (same name as class, never return a value, invoked automatically through object)

        Student stu=new Student(3, "john", 7, "Automation");
        stu.display(); //3 john 7 Automation



    }
}
